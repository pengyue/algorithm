package com.godepth;

import com.godepth.LoopLinkedList.DetectLoop;
import com.godepth.FindNodeFromEndLinklist.FindNodeEfficient;
import com.godepth.FindNodeFromEndLinklist.FindNodeHashTable;
import com.godepth.doublelinkedlist.DoubleLinkedList;
import com.godepth.island.Island;
import com.godepth.pathfinder.Pathfinder;
import com.godepth.singlelinkedlist.SingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        //runIslandCounter();
        //runPathFinder();
        //runSingleLinkedList();
        //runDoubleLinkedList();
        //runFindNodeFromEndEfficiently();
        //runFindNodeFromEndHashTable();
        runDetectLoopInLinkList();
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
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();

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

    private static void runDoubleLinkedList()
    {
        DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();

        linkedList.addAtStart("0.5");
        linkedList.addAfter("First", "0.5");
        linkedList.addAfter("Second" ,"First");
        linkedList.addAfter("Third" ,"Second");
        linkedList.addAfter("2.5" ,"Second");
        linkedList.addAfter("Fourth", "Third");
        linkedList.addAfter("4.5", "Fourth");
        linkedList.removeFirst();
//        linkedList.removeLast();
        linkedList.remove("2.5");

        linkedList.traverse();
    }

    private static void runFindNodeFromEndEfficiently()
    {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
        FindNodeEfficient<Integer> linkList = new FindNodeEfficient<>(list);

        linkList.find(9);
    }

    private static void runFindNodeFromEndHashTable()
    {
        List<String> list = new ArrayList<>();
        Collections.addAll(
                list,
                "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"
        );
        FindNodeHashTable<String> linkList = new FindNodeHashTable<>(list);

        linkList.find(9);
    }

    private static void runDetectLoopInLinkList()
    {
        List<String> list = new ArrayList<>();
        Collections.addAll(
                list,
                "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"
        );

        DetectLoop<String> detectLoop = new DetectLoop<>(list, 3);

        detectLoop.find();
    }
}
