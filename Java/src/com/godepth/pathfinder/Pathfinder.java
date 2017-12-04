package com.godepth.pathfinder;

import java.util.ArrayList;

public class Pathfinder {

    private int[][] maze = {
            {1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0},
            {1, 1, 1, 1, 1},
    };

    public ArrayList<int[]> find(int[] position, int n)
    {
        if (position[0] == n - 1 && position[1] == n - 1) {
            ArrayList<int[]> rtn = new ArrayList<>();
            int[] value = {n-1, n-1};
            rtn.add(value);
            return rtn;
        }

        int x = position[0];
        int y = position[1];

        if (x + 1 < n && this.maze[x+1][y] == 1) {
            int[] newPositionX = {x + 1, y};
            ArrayList<int[]> a = this.find(newPositionX, n);
            if (a != null) {
                int[] temp = {x, y};
                a.add(0, temp);
                return a;
            }
        }

        if (y + 1 < this.maze.length && this.maze[x][y+1] == 1) {
            int[] newPoistionY = {x, y + 1};
            ArrayList<int[]>  b = this.find(newPoistionY, n);
            if (b != null) {
                int[] temp = {x, y};
                b.add(0, temp);
                return b;
            }
        }

        return null;
    }
}
