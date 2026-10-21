/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> span=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        span.add(1);
        s.push(0);
        
        for(int i=1;i<arr.length;i++)
        {
            int currPrice=arr[i];
            
            while(!s.isEmpty() && currPrice>=arr[s.peek()])
            {
                s.pop();

            }
            if(s.isEmpty())
            {
                span.add(i+1);
            }
            else{
                int prevHigh=s.peek();
                span.add(i-prevHigh);
            }
            
            s.push(i);
        }
    
        return span;
    }
    
}
