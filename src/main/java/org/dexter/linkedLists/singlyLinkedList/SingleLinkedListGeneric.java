package org.dexter.linkedLists.singlyLinkedList;

public class SingleLinkedListGeneric<E> {

    private Node<E> head = null;

    private static class  Node<E>{

        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;

        }
    }


    public void insertFirst(E data){
        Node<E> newNode = new Node<>(data);    //

        newNode.next = head;
        head = newNode;

    }

    public void insertLast(E data){
        Node<E> newNode =  new Node<>(data);
        if(head == null){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<E> currentNode = head;
        while (null != currentNode.next ){// check if the next node is not null
            currentNode = currentNode.next;
        }

        currentNode.next  = newNode; // then attach the new node the last node
    }

    public void insert(E data,int position){
        Node<E> newNode =  new Node<>(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        int count =1;
        Node<E> previousNode = head;
        while (count>position-1){
            previousNode = previousNode.next;
            count++;
        }
        Node<E> currentNode = previousNode.next;
        previousNode.next= newNode; // link the new node with the previous one
        newNode.next = currentNode;      // newNode is assign to the previous node position

    }





    public void display(){
        Node<E> currentNode =  head;
        while (currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        SingleLinkedListGeneric<Integer> list = new SingleLinkedListGeneric<>();
         list.insertFirst(34); //34->null
         list.insertFirst(40);// 40->34->null
         list.insertFirst(67); //67->40->34->null
         list.insertLast(30);  // 67->40->34->30->null
        list.insert(100,2);
         list.display();

         SingleLinkedListGeneric<Character> list2 =  new SingleLinkedListGeneric<>();
         list2.insert('a',1);
         list2.insert('b',2);
         list2.display();

    }

}
