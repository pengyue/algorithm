package com.godepth.regex;

public class Regex {

    public static boolean match(char[] pattern, char[] input) {
        if (pattern.length == 0 || input.length == 0)
            return false;

        if (pattern[0] == '*') {
            return matchFromBack(pattern, input);
        } else if (pattern[pattern.length - 1] == '*') {
            return matchFromBeginning(pattern, input);
        } else {
            return (matchFromBeginning(pattern, input) && matchFromBack(pattern, input));
        }
    }

    private static boolean matchFromBeginning(char[] pattern, char[] input) {
        boolean result = true;
        int i, j;

        for (i = 0, j = 0; i < input.length && j < pattern.length; i++, j++) {
            if (pattern[j] == '*') {
                return true;
            } else if (pattern[j] != input[i]) {
                return false;
            }
        }

        // input string did not finish
        if (i != input.length)
            result = false;

        return result;
    }

    private static boolean matchFromBack(char[] pattern, char[] input) {
        boolean result = true;
        int i, j;

        for (i = input.length - 1, j = pattern.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (pattern[j] == '*') {
                return true;
            } else if (pattern[j] != input[i]) {
                return false;
            }
        }

        // input string did not finish
        if (i >= 0)
            result = false;

        return result;
    }
}
