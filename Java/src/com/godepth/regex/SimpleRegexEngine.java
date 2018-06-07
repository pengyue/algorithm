package com.godepth.regex;

public class SimpleRegexEngine {

    public boolean match(char expression[], char str[], int i, int j) {

        if (i == expression.length && j == str.length)
            return true;

        if ((i == expression.length && j != str.length)
                || (i != expression.length && j == str.length))
            return false;

        if (expression[0] == '?' || expression[i] == str[j])
            return match(expression, str, i+1, j+1);

        if (expression[i] == '*')
            return match(expression, str, i+1, j) || match(expression, str, i, j+1) || match(expression, str, i+1, j+1);

        return false;
    }
}
