/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            //check for opening 
            
            if(ch=='{' || ch=='['  || ch=='(')
            {
                st.push(ch);
            }
            else{
                //for closing compare with the top of the stack is canceling or not
                if(st.isEmpty())
                {
                    return false;
                }
                char top=st.peek();
                if((top=='(' && ch==')') || (top=='{'&& ch=='}')  || (top=='['&& ch==']'))
                {
                    st.pop();
                }else{
                    return false;
                }
                
                
            }
            
            
            
            
        }
        
        return st.isEmpty();
        
    }
}

