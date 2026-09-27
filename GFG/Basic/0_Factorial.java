/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/factorial5739/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    int factorial(int n) {
        // code here
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}

