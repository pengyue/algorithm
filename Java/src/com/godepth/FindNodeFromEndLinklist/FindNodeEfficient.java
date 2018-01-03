package com.godepth.FindNodeFromEndLinklist;

import java.util.LinkedList;
import java.util.List;

public class FindNodeEfficient<T> {

    private LinkedList<Node<T>> linkList = null;
    private Node<T> nthNode = null;
    private Node<T> pTemp = null;

    public FindNodeEfficient(List<T> arrayList)
    {
        this.linkList = new LinkedList<>();

        for(T element : arrayList) {
            Node<T> node = new Node<>();
            node.setData(element);
            this.linkList.add(node);
        }
    }

    public void find(int position)
    {
        int count = 0;
        int tempCount = 0;

        for (Node<T> i : this.linkList) {
            System.out.println(i.getData());
        }

        this.pTemp = this.linkList.getFirst();

        Node<T> last = this.linkList.getLast();

        while (this.pTemp != last) {
            if (count < position - 1) {
                this.pTemp = this.linkList.get(count);
            } else {
                this.nthNode = this.linkList.get(tempCount);
                this.pTemp = this.linkList.get(count);
                tempCount++;
            }
            count++;
        }

        if (this.nthNode == null) {
            System.out.println("Cannot find the " + position + "th node from the end of the link list!");
        } else {
            System.out.println("The " + position + "th node data from the end of the link list is " + this.nthNode.getData());
        }
    }

}
