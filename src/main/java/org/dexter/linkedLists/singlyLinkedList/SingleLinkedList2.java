package org.dexter.linkedLists.singlyLinkedList;

public class SingleLinkedList2 {

    private ListNode head;

    private static class ListNode {

        private int data; // generic
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }


    }

    public void displayNode() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }

    public int size() {
        int count = 0;
        if (head == null)
            return 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;

        }
        return count;
    }

    public void insertFirst(int data){
        ListNode newNode =  new ListNode(data); // create a new node
        newNode.next = head;   // put it next to head
        head = newNode;     // head pointing to the new node

    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head =  newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;

    }

    public void insertAtPostionOne(int data, int position){
        ListNode node = new ListNode(data);
        if(position == 1){
            node.next = head; // link the head with new node
            head = node;    // assign new node to the head

        }else{
            ListNode previous  =  head;  // assign head to the previous node
            int count =1;
            while(count < position-1){
                previous = previous.next; // move to next new previous
                count++;
            }
            ListNode currentNode = previous.next;  // the main node we want to shift not to break the link created a temp node
            previous.next = node;  //link the new node to the current node (the node to be shifted)
            node.next = currentNode;  // assign the new node the previous node


        }



    }


    /*
    Q. Implement method to insert a node at a given position. Assuming position to be valid and stating from 1.

    for example - Given following singly Linked List
    head->10->1->8->11->null

     */




    public static void main(String[] args) {

        SingleLinkedList2 list2 = new SingleLinkedList2();
//        list2.head = new ListNode(30);
//        ListNode listNode = new ListNode(65);
//        ListNode listNode1 = new ListNode(40);
//        ListNode listNode2 = new ListNode(78);
//
//        // now we are connecting the link
//        list2.head.next = listNode; // 30-->65
//        listNode.next = listNode1;  // 30-->65-->40
//        listNode1.next = listNode2; // 30-->65-->40-->78-->null

        list2.insertFirst(30);
        list2.insertFirst(65);
        list2.insertFirst(40);
        list2.insertFirst(78);
        //list2.insertLast(60);
        list2.insertAtPostionOne(100,4);

        list2.displayNode();
        System.out.println(list2.size());
    }


}
