package org.dexter.linkedLists.singlyLinkedList.leetCode;

public class ListNode {

    int val ;
    ListNode next;
    ListNode () {};
    ListNode (int val){
        this.val  = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next =  next;

    }
}

 class Solution1{

     public static void main(String[] args) {
         ListNode listNode =  new ListNode(9);
         ListNode node1 = new ListNode(9,listNode);
         ListNode node2 = new ListNode(9,node1);
         ListNode node3 = new ListNode(9,node2);
         ListNode node4 = new ListNode(9,node3);
         ListNode node5 = new ListNode(9,node4);
         ListNode head = new ListNode(9,node5);



         ListNode listNode2 =  new ListNode(9);
         ListNode node33 = new ListNode(9,listNode2);
         ListNode node34 = new ListNode(9,node33);
         ListNode head2 = new ListNode(9,node34);




       ListNode  currentNode = addTwoNumbers(head,head2);

         // Print the linked list
     //    currentNode = addTwoNumbers(listNode,listNode2); // Skip the dummy head
         while (currentNode != null) {
             System.out.print(currentNode.val + " -> ");
             currentNode = currentNode.next;
         }
         System.out.println("null"); // End of list
     }




     public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

         int answer = convertListToSingleInteger(l1) + convertListToSingleInteger(l2);
         String digit = Integer.toString(answer);
         ListNode dummyHead = new ListNode(0);
         ListNode currentNode = dummyHead;

         for(int i = digit.length()-1; i>=0; i--){
             int val = digit.charAt(i) - '0';
             currentNode.next = new ListNode(val);
             currentNode = currentNode.next;
         }
         currentNode = dummyHead.next;

         return currentNode;
     }



//     private static int convertListToSingleInteger(ListNode l1){
//         String digit = "";
//         while (l1 != null){
//             if(l1.val>=0 && l1.val<=9) {
//                 digit += l1.val;
//             }
//                 l1 = l1.next;
//
//
//         }
//         return  Integer.parseInt(digit);
//     }

     private static int convertListToSingleInteger(ListNode l1) {
         StringBuilder digit = new StringBuilder();
         while (l1 != null) {
             if (l1.val >= 0 && l1.val <= 9) {
                 digit.insert(0, l1.val);  // Insert at the beginning to reverse the order
             }
             l1 = l1.next;
         }
         return Integer.parseInt(digit.toString());
     }




}



