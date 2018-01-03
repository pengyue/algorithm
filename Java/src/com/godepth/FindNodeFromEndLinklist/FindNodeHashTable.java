package com.godepth.FindNodeFromEndLinklist;

import java.util.LinkedList;
import java.util.List;

public class FindNodeHashTable<T> {

    private LinkedList<Node<T>> linkList = new LinkedList<>();

    public FindNodeHashTable(List<T> list)
    {
        for (T i : list) {
            Node<T> node = new Node<>();
            node.setData(i);
            this.linkList.add(node);
        }
    }

    public void find(int position) {

        int size = this.linkList.size();

        int target = size - position;

        System.out.println("The " + position + "th node from the end of the link list is '" + this.linkList.get(target).getData() + "'");
    }
}
