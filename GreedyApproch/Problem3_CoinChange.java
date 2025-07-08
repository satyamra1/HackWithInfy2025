package GreedyApproch;

import java.util.Arrays;

// que - You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
// Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
// You may assume that you have an infinite number of each kind of coin.
// The answer is guaranteed to fit into a signed 32-bit integer.
public class Problem3_CoinChange {
     public static void main(String[] args){
        int amount=10;
        int coins[] ={1,2,2};
        int ans = change(amount,coins);
        System.out.println(ans);
    
    
}
public static int change(int amount, int[] coins) {
     int dp[][]=new int[amount+1][coins.length+1];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        return TotalPermutaion(coins,amount,0,dp);
       
    }
    public static int TotalPermutaion(int arr[],int amt,int i,int dp[][]){
        if(amt==0){
            return 1;
        }
        if(i==arr.length){
            return 0;
        }
        if(dp[amt][i]!=-1){
            return dp[amt][i];
        }
        int inc=0,exc=0;
        if (arr[i]<=amt){
            inc=TotalPermutaion(arr,amt-arr[i],i,dp);
        }
        exc=TotalPermutaion(arr,amt,i+1,dp);

        return dp[amt][i]=inc+exc;

    }
}
