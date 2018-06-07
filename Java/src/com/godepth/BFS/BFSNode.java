package com.godepth.BFS;

public class BFSNode<T> {
    private T data = null;
    private BFSNode<T> left, right;

    public BFSNode(T item) {
        data = item;
        left = right = null;
    }

    public BFSNode<T> getLeft() {
        return left;
    }

    public void setLeft(BFSNode<T> node) {
        left = node;
    }

    public BFSNode<T> getRight() {
        return right;
    }

    public void setRight(BFSNode<T> node) {
        right = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T item) {
        data = item;
    }
}
