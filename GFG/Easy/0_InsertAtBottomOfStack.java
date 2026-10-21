/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here'
        if(st.isEmpty())
        {
            st.push(x);
            return st;
        }
        int top=st.pop();
        insertAtBottom(st,x);
        st.push(top);
        
   return st;
    }
     
}
