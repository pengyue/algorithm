package com.godepth.singlelinkedlist;

public class Node<T> implements Comparable<T>{

    private T data;
    private Node<T> next = null;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public boolean hasNext()
    {
        return this.getNext() != null;
    }

    @Override
    public int compareTo(T arg)
    {
        return (arg == this.data) ? 0 : 1;
    }
}
