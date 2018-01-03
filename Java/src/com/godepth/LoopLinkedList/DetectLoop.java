package com.godepth.LoopLinkedList;

import com.godepth.FindNodeFromEndLinklist.FindNodeHashTable;

import java.util.List;

public class DetectLoop<T> {

    private LoopLinkedList<T> loopLinkedList = null;

    private Node<T> harePointer = null;

    private Node<T> tortisePointer = null;

    public DetectLoop(List<T> list, int loopFrom)
    {
        this.loopLinkedList = new LoopLinkedList<>();

        for (T i : list) {
            this.loopLinkedList.push(i);
        }

        //Create the loop
        this.loopLinkedList.makeLoop(2);
    }

    public void find()
    {
        if (this.loopLinkedList != null) {
            Node<T> current = this.loopLinkedList.getHead();

//            while (current != null) {
//                System.out.println(current.getData());
//                current = current.getNext();
//            }

            this.tortisePointer = current;
            this.harePointer = current.getNext();
            boolean flag = false;

            while (true) {

                if (this.harePointer == this.tortisePointer) {
                    flag = true;
                    break;
                } else {
                    if (this.tortisePointer.getNext() != null) {
                        this.tortisePointer = this.tortisePointer.getNext();
                    } else {
                        flag = false;
                        break;
                    }

                    if (this.harePointer.getNext() != null && this.harePointer.getNext().getNext() != null) {
                        this.harePointer = this.harePointer.getNext().getNext();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) {
                System.out.println("Loop not detected!");
            } else {
                System.out.println("Loop detected!");
            }

        } else {
            System.out.println("The link list is empty.");
        }

    }

}
