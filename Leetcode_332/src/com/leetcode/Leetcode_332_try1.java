/*
 * 322. Coin Change
Medium

12678

285

Add to List

Share
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 

Constraints:

1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
*/


package com.leetcode;

public class Leetcode_332_try1 {
	public static void main(String[] args) {
		int coins[]= {1,2,5};
		int amount =11;
	}
	
	public static int  coinChange(int[] coins, int amount) {
        if (amount == 0 ) {
        	return 0 ;
        }
        int cLength = coins.length;
        
        
        int [] dp = new int [coins.length+1];
        
        for (int num : dp) {
        	num = amount+1;   // Default Max value 
        }
        
        dp[0]=0;
        
        for (int i =0 ; i<dp.length ; i ++) {
        	for (int k =0 ; k< cLength ; k ++) {
        		dp[i]=Math.min(dp[i], 1+dp[i-coins[k]]);
        	}
        }
        
		return  dp[dp.length]== Integer.MAX_VALUE ?-1: dp[dp.length];
    }
}
