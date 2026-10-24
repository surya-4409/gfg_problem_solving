/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++)
        {
            firstHalf.add(q.remove());
            
        }
        while(!firstHalf.isEmpty())
        {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
}

