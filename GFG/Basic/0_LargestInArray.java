/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            large=Math.max(arr[i],large);
        }
        return large;
    }
}

