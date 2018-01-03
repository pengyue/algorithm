package com.godepth.singlelinkedlist;

public class SingleLinkedList<T> {

    private Node<T> start = null;
    private Node<T> end = null;

    public void add(T element)
    {
        Node<T> node = new Node<>();
        node.setData(element);

        System.out.println("Adding: " + element);

        if (start == null) {
            this.start = node;
            this.end = node;
        } else {
            this.end.setNext(node);
            this.end = node;
        }
    }

    public void addAfter(T element, T after)
    {
        Node<T> temp = this.start;
        Node<T> ref = null;
        System.out.println("Traversing to all nodes...");

        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.compareTo(after) == 0) {
                ref = temp;
                break;
            }
            temp = temp.getNext();
        }

        if (ref != null) {
            Node<T> node = new Node<>();
            node.setData(element);
            node.setNext(temp.getNext());
            if (temp == this.end) {
                this.end = node;
            }
            temp.setNext(node);
        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void removeFront()
    {
        if (this.start == null) {
            System.out.println("Underflow...");
        }

        Node<T> temp = this.start;
        this.start = temp.getNext();

        if (this.start == null) {
            this.end = null;
        }

        System.out.println("Deleted:" + temp.getData());

    }

    public void removeAfter(T after)
    {
        Node<T> current = this.start;
        Node<T> ref;
        System.out.println("Traversing to all nodes...");

        if (current.compareTo(after) == 0) {
            this.start = current.getNext();
            System.out.println("Deleted after: " + current.getData());
        } else {
            while (true) {
                Node<T> next = current.getNext();

                if (next == this.end) {
                    ref = null;
                    break;
                }

                if (next.compareTo(after) == 0) {
                    ref = next.getNext();
                    break;
                }
            }

            if (ref != null) {
                System.out.println("Deleted after: " + current.getData());
                current.setNext(ref);
            } else {
                System.out.println("Unable to find the given element...");
            }
        }
    }

    public void deleteNode(T node)
    {
        Node<T> current = this.start;
        Node<T> previous = current;

        while (current.compareTo(node) == 1) {
            previous = current;
            current = current.getNext();
        }

        previous.setNext(current);

    }

    public void traverse()
    {
        Node<T> current = this.start;

        while (true) {

            System.out.println("Data: " + current.getData());

            if (current != this.end) {
                current = current.getNext();
            } else {
                break;
            }
        }
    }
}
