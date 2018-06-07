package com.godepth.BFS;

public class BFSTree<T> {
    public BFSNode<T> root;

    public BFSTree() {
        root = null;
    }

    public void printLevelOrder() {
        int height, i;
        height = height(root);

        for (i = 1; i <= height; i++) {
            printGivenLevel(root, i);
        }
    }

    private int height(BFSNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.getLeft());
            int rightHeight = height(root.getRight());
            return ((leftHeight > rightHeight ? leftHeight : rightHeight) + 1);
        }
    }

    private void printGivenLevel(BFSNode<T> root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else if (level > 1) {
            printGivenLevel(root.getLeft(), level - 1);
            printGivenLevel(root.getRight(), level - 1);
        }
    }
}