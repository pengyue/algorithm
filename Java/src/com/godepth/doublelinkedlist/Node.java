package com.godepth.doublelinkedlist;

public class Node<T> implements Comparable<T>{

    private T data = null;
    private Node<T> next = null;
    private Node<T> previous = null;

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return this.data;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public boolean hasNext()
    {
        return this.next != null;
    }

    public void setPrevious(Node<T> previous)
    {
        this.previous = previous;
    }

    public Node<T> getPrevious()
    {
        return this.previous;
    }

    public boolean hasPrevious()
    {
        return this.previous != null;
    }

    @Override
    public int compareTo(T arg)
    {
        return (arg == this.data) ? 0 : 1;
    }
}
