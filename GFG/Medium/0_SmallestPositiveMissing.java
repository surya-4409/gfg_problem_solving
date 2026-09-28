/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int missingNumber(int[] arr) {
        // code here
       HashSet<Integer> set=new HashSet<>();
       for(int num:arr)
       {
           set.add(num);
       }
       for(int i=1;i<=arr.length;i++)
       {
           if(!set.contains(i))
           {
               return i;
           }
       }
       
       return arr.length+1;
    }
}

