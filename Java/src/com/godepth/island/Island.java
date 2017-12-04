package com.godepth.island;

public class Island {

    private int[][] ocean = {
            {1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 1, 1}
    };

    private int maxSize = 0;

    private int[][] countArray = new int[5][5];

    private int getValue(int row, int column, int maxRow, int maxColumn)
    {
        if (row < 0 || row >= maxRow || column < 0 || column >= maxColumn) {
            return 0;
        } else {
            return this.ocean[row][column];
        }
    }

    private void findIsland(int row, int column, int maxRow, int maxColumn, int size)
    {
        if (row >= maxRow || column >= maxColumn) {
            return ;
        }

        this.countArray[row][column] = 1;
        size += 1;

        if (size > this.maxSize) {
            this.maxSize = size;
        }

        int[][] direction = {
                {-1,  0},
                {-1, -1},
                {0,  -1},
                {1,  -1},
                {1,   0},
                {1,   1},
                {0,   1},
                {-1,  1}
        };

       for (int i = 0 ; i < 7 ; i++) {
           int newRow = row + direction[i][0];
           int newColumn = column + direction[i][1];

           int value = this.getValue(newRow, newColumn, this.ocean.length, this.ocean[0].length);

           if (value > 0 && (this.countArray[newRow][newColumn] == 0)) {
               this.findIsland(newRow, newColumn, this.ocean.length, this.ocean[0].length, size);
           }
       }

       this.countArray[row][column] = 0;
    }

    public int getMaxOnes()
    {
        for (int i = 0; i < this.ocean.length; i++) {
            for(int j = 0; j < this.ocean[0].length; j++) {
                if (this.ocean[i][j] == 1) {
                    this.findIsland(i, j, this.ocean.length, this.ocean[0].length, 0);
                }
            }
        }

        return this.maxSize;
    }
}
