/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
 * Platform     : GFG
 * Difficulty   : Hard
 */

class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int maxArea=0;
        int msr[] =new int[arr.length];
        int msl[] =new int[arr.length];
        
        
        //max smaller right
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msr[i]=arr.length;
            }
            else{
                msr[i]=s.peek();
            }
            
            s.push(i);
        }
        
        
        //max smaller left
        
        s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msl[i]=-1;
            }
            else{
                msl[i]=s.peek();
            }
            
            s.push(i);
        }
        
        
        //calculating the area of each index
        
        for(int i=0;i<arr.length;i++)
        {
            int height=arr[i];
            int width=msr[i]-msl[i]-1;
            int currArea=height *width;
            maxArea=Math.max(currArea,maxArea);
        }
        
        return maxArea;
    }
}

