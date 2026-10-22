/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> nextgreater=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
                    nextgreater.add(-1);
                }
         
        for(int i=arr.length-1;i>=0;i--)
        {
            //1 pop smaller elements from stack
            
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            // if -else checking stack for greater elemnts after removing the smaller elements
            
            if(s.isEmpty())
            {
                nextgreater.set(i,-1);
            }
            else{
                nextgreater.set(i,arr[s.peek()]);
            }
            
            s.push(i);
            
        }
        return nextgreater;
    }
}
