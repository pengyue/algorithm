package com.godepth.DFS;

public class DFSNode<T> {
    private T data = null;
    private DFSNode<T> left, right;

    public DFSNode(T item) {
        data = item;
        left = right = null;
    }

    public DFSNode<T> getLeft() {
        return left;
    }

    public void setLeft(DFSNode<T> node) {
        left = node;
    }

    public DFSNode<T> getRight() {
        return right;
    }

    public void setRight(DFSNode<T> node) {
        right = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T item) {
        data = item;
    }
}