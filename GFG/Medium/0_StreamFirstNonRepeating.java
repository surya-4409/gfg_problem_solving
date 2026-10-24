/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
                
            }
            if(q.isEmpty())
            {
                result.append('#');
            }
            else{
                result.append(q.peek());
            }
            
        }
        return result.toString();
    }
}
