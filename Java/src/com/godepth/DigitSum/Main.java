package com.godepth.DigitSum;

public class Main {

    public static void main(String[] args)
    {
        DigitSum digitSum = new DigitSum();
        digitSum.calculate();
    }
}


class DigitSum
{
    private int[] data = {9875, 3};

    public void calculate()
    {
        int finalResult = 0;
        int number = data[0];
        int cnt = data[1];

        //String numberStr = Integer.toString(number);
        //char digit[] = numberStr.toCharArray();
        //String[] digit = numberStr.split("(?<=.)");

        int result = count(number, 0);

        if (cnt > 1) {
            result = result * cnt;
            finalResult = count(result, 0);
        } else {
            finalResult = result;
        }

        System.out.print("number : " + finalResult);
    }

    private int count(int num, int total)
    {
        int remain = num % 10;
        int divide = num / 10;
        if (remain > 0 && divide > 0) {
            total = total + remain;
            total =  count(divide, total);
        } else if (remain > 0 && divide == 0) {
            total = total + remain;
        } else if (remain == 0 && divide > 0) {
            total = count(divide, total);
        }

        if (total > 10) {
            total = count(total, 0);
        }

        return total;
    }
}
