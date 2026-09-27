/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/identical-linked-lists/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        int h1=0;
        int h2=0;
        // code here
        if(head1==null || head2==null)
        {
            return false;
        }
        while(head1!=null && head2!=null)
        {
            if(head1.data!=head2.data)
            {
                return false;
            }
            if(head1.next!=null)
            {
                h1++;
            }
            if(head2.next!=null)
            {
                h2++;
            }
            
            
            head1=head1.next;
            head2=head2.next;
        }
        if(h1!=h2)
        {
            return false;
        }
        
        
        return true;
        
    }
}
