package com.godepth.BFS;

import java.util.Queue;
import java.util.LinkedList;

public class QueueBFSTree<T> {

    public BFSNode<T> root;

    public void printLevelOrder()
    {
        Queue<BFSNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BFSNode<T> temp = queue.poll();
            System.out.print(temp.getData());

            if (temp.getLeft() != null) {
                queue.add(temp.getLeft());
            }

            if (temp.getRight() != null) {
                queue.add(temp.getRight());
            }
        }
    }
}
