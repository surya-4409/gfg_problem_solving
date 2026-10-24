/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Queue<Integer>  q2=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        if(k>q.size())
        {
            return q;
        }
        for(int i=0;i<k;i++)
        {
            
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q2.add(s.pop());
        }
        while(!q.isEmpty())
        {
            q2.add(q.remove());
        }
        return q2;
    }
}
