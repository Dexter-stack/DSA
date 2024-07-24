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
            previous.next = node;  // previous pointing to the new node
            node.next = currentNode;  // pointing new node to the shifted node


        }







    }

    public ListNode deleteFirst(){

        if(head == null){
            return  null;
        }
        ListNode tempNode =  head;  // create a temp node to hold the head
        head = head.next; // shift the head to the next node
        tempNode.next = null;  // breaking the link of the deleted value
        return tempNode;

    }


    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return  head;
        }

        //create two pointers

        ListNode currentNode = head;
        ListNode previousNode = null;
        while (currentNode.next != null){
            previousNode = currentNode;   // current node and previous point at same node  // second to the last node
            currentNode = previousNode.next; // current node a step further // last node
        }
        previousNode.next = null;
        return currentNode;

    }

    /*
    Q. Implement method to delete a node at a given position. Assuming position to be valid and starting from 1.
     */

    public  ListNode deleteNPosition(int position){
        if(position ==1){
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;

        }

        int count =1;
       ListNode previousNode = head;
       while (count<position-1){
           previousNode = previousNode.next;
           count++;
       }
       ListNode currentNode = previousNode.next;  // node to be deleted
       previousNode.next = currentNode.next;     // linking the next node with the previous one
        return currentNode;
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
        list2.insertLast(60);
        list2.insertAtPostionOne(100,4);
        list2.displayNode();
        System.out.println(list2.deleteLast());
        list2.displayNode();
        System.out.println( list2.deleteNPosition(2).data);  //78-->65-->100-->30-->null

        list2.displayNode();
//        System.out.println(list2.size());
//        System.out.println(list2.deleteFirst().data);
//
//        list2.displayNode();

    }


}
