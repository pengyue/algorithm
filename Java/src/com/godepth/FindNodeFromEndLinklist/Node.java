package com.godepth.FindNodeFromEndLinklist;

public class Node<T> implements  Comparable<T> {
    private T data;

    public T getData()
    {
        return this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    @Override
    public int compareTo(T data)
    {
        return this.getData() == data ? 0 : 1;
    }
}
