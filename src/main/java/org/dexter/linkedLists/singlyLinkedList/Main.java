package org.dexter.linkedLists.singlyLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // Output: Nodes of singly linked list: 10 20 30

        list.removeFirst();
        list.display(); // Output: Nodes of singly linked list: 20 30
        
    }
}
