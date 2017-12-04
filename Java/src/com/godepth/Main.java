package com.godepth;

import com.godepth.island.Island;
import com.godepth.pathfinder.Pathfinder;
import com.godepth.singlelinkedlist.SingleLinkedList;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //runIslandCounter();
        //runPathFinder();
        runSingleLinkedList();
    }

    private static void runIslandCounter()
    {
        Island runner = new Island();
        System.out.println("Running the algorithm on finding island in ocean:");
        int number = runner.getMaxOnes();

        System.out.println("The island number is " + number);
    }

    private static void runPathFinder()
    {
        Pathfinder finder = new Pathfinder();
        System.out.println("Running the algorithm on finding path in array:");
        int[] startPosition = {0, 0};
        ArrayList<int[]> list = finder.find(startPosition, 5);

        System.out.println("The island number is below");
        if (list != null) {
            for (int[] item : list) {
                System.out.println(item[0] + "," + item[1]);
            }
        } else {
            System.out.println("Could not find any path.");
        }
    }

    private static void runSingleLinkedList()
    {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.addAfter(6, 4);

        linkedList.removeFront();

        linkedList.removeAfter(3);

        linkedList.traverse();
    }

}
