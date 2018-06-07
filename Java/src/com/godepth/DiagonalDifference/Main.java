package com.godepth.DiagonalDifference;

class AbsoluteDifference {

    private int[][] square = {
            {3},
            {11, 2, 4},
            {4,  5, 6},
            {10, 8, -12}
    };

    public int count()
    {
        int length = square[0][0];
        int i;
        int left = 0;
        int right = 0;

        for (i = 0; i < length ; i++) {
            left = left + square[i+1][i];
            right = right + square[i+1][length-i-1];
        }

        return Math.abs(left - right);
    }
}

public class Main {
    public static void main(String[] args) {
        AbsoluteDifference diff = new AbsoluteDifference();
        System.out.print("Disgonal diff absolute value is " + diff.count());
    }
}
