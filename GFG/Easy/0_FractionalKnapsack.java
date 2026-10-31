/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wt[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        double finalval=0;
        
        for(int i=ratio.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=wt[idx])
            {
                finalval+=val[idx];
                capacity-=wt[idx];
            }
            else{
                finalval+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        return finalval;
    }
}
