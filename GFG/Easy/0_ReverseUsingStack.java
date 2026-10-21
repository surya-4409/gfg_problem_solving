/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public String reverse(String S) {
        // code here
        
        
        Stack<Character> st=new Stack<>();
        
        
        
        int idx=0;
        while(idx < S.length())
        {
            st.push(S.charAt(idx));
            idx++;
        }
        
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty())
        {
            char curr=st.pop();
            result.append(curr);
        }
        return result.toString();
    }
}
