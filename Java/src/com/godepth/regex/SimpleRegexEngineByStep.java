package com.godepth.regex;

public class SimpleRegexEngineByStep {

    public boolean match(String expression, String str) {
        if (expression.equals(""))
            return true;
        else if (expression.equals("$") && str.equals(""))
            return true;
        else if (expression.charAt(1) == '?')
            return matchQuestionSign(expression, str);
        else if (expression.charAt(1) == '*') {
            return matchStarSign(expression, str);
        }
        else
            return matchOne(expression.charAt(0), str.charAt(0)) && match(expression.substring(1), str.substring(1));
    }

    private boolean matchOne(Character expression, Character str){
        if (expression.toString().equals(""))
            return true;
        else if (str.toString().equals(""))
            return false;
        else
            return expression.equals('.') || expression.equals(str);
    }

    private boolean matchQuestionSign(String expression, String str) {
        return (matchOne(expression.charAt(0), str.charAt(0)) && match(expression.substring(2), str.substring(1))) || match(expression.substring(2), str);
    }

    private boolean matchStarSign(String expression, String str) {
        return (matchOne(expression.charAt(0), str.charAt(0)) && match(expression, str.substring(1)))
                || match(expression.substring(2), str);

    }

    private boolean matchSameLength(String expression, String str){
        return expression.equals("")
                || (expression.charAt(0) == str.charAt(0) && match(expression.substring(1), str.substring(1)));
    }

    private boolean matchDollarSign(String expression, String str) {
        return expression.equals("")
                || (expression.equals("$") && str.equals(""))
                || (matchOne(expression.charAt(0), str.charAt(0)) && match(expression.substring(1), str.substring(1)));
    }

    private boolean searchCaret(String expression, String str) {
        return (expression.charAt(0) == '^') ? match(expression.substring(1), str) : match(".*" + expression, str);
    }
}
