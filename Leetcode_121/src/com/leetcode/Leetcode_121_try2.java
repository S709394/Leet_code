
/*idea:
 *  Runtime: 2 ms, faster than 93.74% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 59.1 MB, less than 92.17% of Java online submissions for Best Time to Buy and Sell Stock.
 * */
 

package com.leetcode;

public class Leetcode_121_try2 {
	
	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
	}
	
	public int maxProfit(int[] prices) {
        int max = 0 , lowest = prices[0] , len = prices.length;
        
        for (int i = 1 ; i < len ; i ++) {
        	if( prices[i] <lowest)   lowest= prices[i];
        	
        	if (max< (prices[i]- lowest)){
        		max = prices[i]- lowest;
        	}
        	
        }
        return max;
        
    }
	
	
}
