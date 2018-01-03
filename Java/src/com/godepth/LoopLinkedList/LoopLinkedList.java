package com.godepth.LoopLinkedList;


import java.util.List;

public class LoopLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private Node<T> previous = null;

    public void push(T element)
    {
        Node<T> newNode = new Node<>();
        newNode.setData(element);

        if (this.previous == null) {
            this.head = newNode;
        } else {
            this.previous.setNext(newNode);
        }

        this.previous = newNode;

        this.tail = newNode;
    }

    public Node<T> getHead()
    {
        return this.head;
    }

    public Node<T> getTail()
    {
        return this.tail;
    }

    public void makeLoop(int position)
    {
        Node<T> node = this.head.getNext();
        int count = 0;

        while (node != null) {
            node = node.getNext();
            if (count == position) {
                this.tail.setNext(node);
                break;
            }
            count++;
        }
    }
}
