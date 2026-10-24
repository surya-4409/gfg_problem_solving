/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/queue-reversal/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> s=new Stack<>();
        
        while(!q.isEmpty())
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }
}
