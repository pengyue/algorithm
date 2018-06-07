package com.godepth.DFS;

public class DFSTraversal<T> {

    public DFSNode<T> root;

    public void printInorder(DFSNode<T> node)
    {
        if (node == null)
            return;

        printInorder(node.getLeft());

        System.out.print(node.getData() + " ");

        printInorder(node.getRight());
    }

    public void printPreorder(DFSNode<T> node)
    {
        if (node == null)
            return;

        System.out.print(node.getData() + " ");

        printPreorder(node.getLeft());

        printPreorder(node.getRight());
    }

    public void printPostorder(DFSNode<T> node)
    {
        if (node == null)
            return;

        printPostorder(node.getLeft());

        printPostorder(node.getRight());

        System.out.print(node.getData() + " ");
    }
}
