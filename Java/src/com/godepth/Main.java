package com.godepth;

import com.godepth.BFS.BFSNode;
import com.godepth.BFS.QueueBFSTree;
import com.godepth.DFS.DFSNode;
import com.godepth.DFS.DFSTraversal;
import com.godepth.DFS.StackDSTTree;
import com.godepth.FindNodeFromEndLinklist.FindNodeEfficient;
import com.godepth.FindNodeFromEndLinklist.FindNodeHashTable;
import com.godepth.LoopLinkedList.DetectLoop;
import com.godepth.BFS.BFSTree;
import com.godepth.doublelinkedlist.DoubleLinkedList;
import com.godepth.island.Island;
import com.godepth.pathfinder.Pathfinder;
import com.godepth.regex.Regex;
import com.godepth.regex.SimpleRegexEngine;
import com.godepth.regex.SimpleRegexEngineByStep;
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
        //runDetectLoopInLinkList();
        //runRecursiveBFS();
        //runQueueBFS();
        ////runQueueDFS();
        //runDFSInorder();
        runRegexOne();
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

    private static void runRecursiveBFS()
    {
        BFSTree<Integer> tree = new BFSTree<>();
        tree.root= new BFSNode<>(1);
        tree.root.setLeft(new BFSNode<>(2));
        tree.root.setRight(new BFSNode<>(3));
        tree.root.getLeft().setLeft(new BFSNode<>(4));
        tree.root.getLeft().setRight(new BFSNode<>(5));
        tree.root.getRight().setLeft(new BFSNode<>(6));
        tree.root.getRight().setRight(new BFSNode<>(7));

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }

    private static void runQueueBFS()
    {
        QueueBFSTree<Character> tree = new QueueBFSTree<>();
        tree.root = new BFSNode<>('A');
        tree.root.setLeft(new BFSNode<>('B'));
        tree.root.setRight(new BFSNode<>('C'));
        tree.root.getLeft().setLeft(new BFSNode<>('D'));
        tree.root.getLeft().setRight(new BFSNode<>('E'));
        tree.root.getLeft().getRight().setLeft(new BFSNode<>('F'));

        System.out.println("Level order traversal of binary tree is - ");
        tree.printLevelOrder();
    }

    private static void runQueueDFS()
    {
        StackDSTTree<Character> tree = new StackDSTTree<>();
        tree.root = new DFSNode<>('A');;
        tree.root.setLeft(new DFSNode<>('B'));
        tree.root.setRight(new DFSNode<>('C'));
        tree.root.getLeft().setLeft(new DFSNode<>('D'));
        tree.root.getLeft().setRight(new DFSNode<>('E'));
        tree.root.getLeft().getRight().setLeft(new DFSNode<>('F'));

        System.out.println("Depth order traversal of binary tree is - ");
        tree.printDepthOrder();

    }

    private static void runDFSInorder()
    {
        DFSTraversal<Integer> tree = new DFSTraversal<>();
        tree.root = new DFSNode<>(25);

        tree.root.setLeft(new DFSNode<>(15));

        tree.root.getLeft().setLeft(new DFSNode<>(10));
        tree.root.getLeft().setRight(new DFSNode<>(22));

        tree.root.getLeft().getLeft().setLeft(new DFSNode<>(4));
        tree.root.getLeft().getLeft().setRight(new DFSNode<>(12));

        tree.root.getLeft().getRight().setLeft(new DFSNode<>(18));
        tree.root.getLeft().getRight().setRight(new DFSNode<>(24));

        tree.root.setRight(new DFSNode<>(50));

        tree.root.getRight().setLeft(new DFSNode<>(35));
        tree.root.getRight().setRight(new DFSNode<>(70));

        tree.root.getRight().getLeft().setLeft(new DFSNode<>(31));
        tree.root.getRight().getLeft().setRight(new DFSNode<>(44));

        tree.root.getRight().getRight().setLeft(new DFSNode<>(66));
        tree.root.getRight().getRight().setRight(new DFSNode<>(90));

        System.out.println("\nPreorder traversal of BST is ");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal of BST is ");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal of BST is ");
        tree.printPostorder(tree.root);
    }

    private static void runRegexOne()
    {
        String expression ="a*b*";
        String text = "aabbbb";

        //SimpleRegexEngine regex = new SimpleRegexEngine();
        //Regex regex = new Regex();
        //System.out.println("Regex result is " + (regex.match(expression.toCharArray(), text.toCharArray()) ? "true" : "false"));

        SimpleRegexEngineByStep regex = new SimpleRegexEngineByStep();
        System.out.println("Regex result is " + (regex.match(expression, text) ? "true" : "false"));
    }
}
