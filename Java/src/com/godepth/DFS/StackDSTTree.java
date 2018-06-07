package com.godepth.DFS;

import java.util.Stack;

public class StackDSTTree<T> {

    public DFSNode<T> root;

    public void printDepthOrder()
    {
        Stack<DFSNode<T>> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){

            DFSNode<T> temp = stack.pop();
            System.out.print(temp.getData());

            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }

            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
        }
    }
}
