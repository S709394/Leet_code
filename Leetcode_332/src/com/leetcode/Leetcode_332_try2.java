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
1 <= coins[i] <= 2^31 - 1
0 <= amount <= 10^4
*/
/*Idea:
 * DP   dynamic programming
 * 
 * 
 * 2 for loops 
 * 
 *  the   i  for-loop is for the amounts ,  we try to get the amounts 1 by 1 and return the very last one .
 * 
 * method : Arrays.fill
 * 
 * */

package com.leetcode;

import java.util.Arrays;

public class Leetcode_332_try2 {
	public static void main(String[] args) {

		int coins[] = { 1, 2, 5 };
		int amount = 11;
		System.out.println(coinChange(coins, amount));

	}

	public static int coinChange(int[] coins, int amount) {

		if (amount == 0)
			return 0;
		
		// a default  value of this amount ;
		int myMax = amount + 1;
		int[] dp = new int[myMax];

		

		// set all to default ( amount +1 )
		Arrays.fill(dp, myMax);
		
		dp[0]=0;
		
		
		// calculate the possible answer for every amount
		for (int i = 1 ; i < myMax;i++) {
			
			for (int k = 0 ; k < coins.length;k++) {
				
				// to make sure the  i - coin[k] >= 0 ;
				if (i >= coins[k]) {
					
					dp[i]= Math.min(dp[i], 1+dp[i-coins[k]]);
				}
			}
			
		}
		// if the dp [amount] is still default value , then return -1 
		//or return the answer we want 
		return dp[amount]== myMax ? -1: dp[amount];
	}
}
