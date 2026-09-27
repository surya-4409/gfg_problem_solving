/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
        // code here
        Node  mid=findMid(head);
        
        Node right=mid.next;
        mid.next=null;
        Node prev=null;
        Node curr=right;
        
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
         }
         
         Node left=head;
         Node right_=prev;
         
         while(left!=null && right_!=null)
         {
             if(left.data==right_.data)
             {
                 left=left.next;
                 right_=right_.next;
             }
             else{
                 return false;
             }
         }
         
        return true;
    }
}
