package org.dexter.linkedLists.singlyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Add elements to the list
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);

        // Print the size of the list
        System.out.println("Size of the list: " + list.size());

        // Print the first and last elements of the list
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        // Remove the first element and print it
        System.out.println("Removed first element: " + list.removeFirst());

        // Print the size of the list after removal
        System.out.println("Size of the list after removal: " + list.size());

        // Print the first and last elements of the list after removal
        System.out.println("First element after removal: " + list.first());
        System.out.println("Last element after removal: " + list.last());

    }
}
