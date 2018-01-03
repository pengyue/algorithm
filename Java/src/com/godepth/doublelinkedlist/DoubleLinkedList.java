package com.godepth.doublelinkedlist;

public class DoubleLinkedList<T> {

    private Node<T> start = null;
    private Node<T> end = null;

    public boolean addAtStart(T element)
    {
        Node<T> node = new Node<>();
        node.setData(element);

        if (this.start == null && this.end == null) {
            this.start = node;
            node.setPrevious(null);
            node.setNext(null);
            this.end = node;
            return true;
        }

        return false;
//        Node<T> current = this.start.getNext();
//
//        node.setNext(current);
//        node.setPrevious(null);
//        current.setPrevious(node);
//
//        this.start = node;
//
//        return true;
    }

    public boolean addAtEnd(T element)
    {
        Node<T> node = new Node<>();
        node.setData(element);

        if (this.end == null && this.start == null) {
            node.setPrevious(null);
            node.setNext(null);
            this.end = node;
            return true;
        }

        Node<T> current = this.start.getNext();

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);
        node.setPrevious(current);
        node.setNext(null);

        this.end = node;

        return true;
    }

    public boolean addAfter(T element, T after)
    {
        Node<T> node = new Node<>();
        Node<T> ref = new Node<>();
        node.setData(element);

        if (this.start == null) {
            this.start = node;
            return true;
        }

        Node<T> current = this.start;

        while (true) {
            if (current == null) {
                break;
            }
            if (current.compareTo(after) == 0) {
                ref = current;
                break;
            }
            current = current.getNext();
        }

        Node<T> next = ref.getNext();
        ref.setNext(node);
        node.setNext(next);

        node.setPrevious(ref);

        if (next != null) {
            next.setPrevious(node);
        }

        return true;
    }

    public boolean removeFirst()
    {
        if (this.start == null) {
            //TODO, throw an exception as list is empty
            return false;
        }

        Node<T> node = this.start.getNext();
        this.start = node;

        return true;
    }

    public boolean removeLast()
    {
        if (this.end == null) {
            return false;
        }

        Node<T> end = this.end;
        System.out.println(end);
        System.out.println(end.getData());

        this.end = end.getPrevious();
        end = null;
        return true;
    }

    public boolean remove(T element)
    {
        if (this.start == null) {
            //TODO, throw an exception there is no element in list
            return false;
        }

        Node<T> current = this.start;

        while (current.compareTo(element) == 1) {
            current = current.getNext();
        }

        if (current.getNext() == null && current.compareTo(element) == 1) {
            //TODO, unable to find the node
            return false;
        }

        Node<T> previous = current.getPrevious();
        Node<T> next = current.getNext();
        previous.setNext(next);
        next.setPrevious(previous);
        current = null;

        return true;
    }

    public void traverse()
    {
        if (this.start == null) {
            return;
        }

        Node<T> current = this.start;

        do {
            System.out.println("Data: " + current.getData());
            current = current.getNext();
        } while (current != null);

        return;
    }
}
