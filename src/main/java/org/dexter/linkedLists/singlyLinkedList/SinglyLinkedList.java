package org.dexter.linkedLists.singlyLinkedList;

public class SinglyLinkedList<E> {
    // Nested Node class
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;  // head node of the list
    private Node<E> tail = null;  // last node of the list
    private int size = 0;         // number of nodes in the list

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head); // pass in newest element and pass the head as the next
        if (size == 0)    // if the list size is zero then head is the same as the tail
            tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);   // set the next to newest after the tail
        }
        tail = newest;  // newest element becomes the tail
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        E answer = head.getElement();    // get element to be removed
        head = head.getNext();    // head shifts to the next element
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;    // return the removed one
    }

    public void display() {
        // Node current will point to head
        Node<E> current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();  // move to the next node
        }
        System.out.println();
    }


}
