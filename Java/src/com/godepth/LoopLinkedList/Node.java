package com.godepth.LoopLinkedList;

public class Node<T> implements  Comparable<T> {

    private T data;
    private Node<T> next = null;

    public T getData()
    {
        return this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> node)
    {
        this.next = node;
    }

    @Override
    public int compareTo(T data)
    {
        return this.getData() == data ? 0 : 1;
    }
}
