//import java.util.Arrays;

// Runtime
//4 ms
//Beats
//94.37%
//Memory
//61 MB
//Beats
//7.16%


// time complexity : O(n) because it iterates through the array once
//space complexity is O(n) because the hashmap stores up to n unique domino pairs.

public class Leetcode_1128_try3_practise_smallfixTry1 {
	public int numEquivDominoPairs(int[][] dominoes) {

//		1 <= dominoes[i][j] <= 9

// all we need s is 9 * 9
		int[] arr = new int[100];

		int dLen = dominoes.length;

		int ans = 0;
		for (int i = 0; i < dLen; i++) {

//			Arrays.sort(dominoes[i]);

			ans += arr[dominoes[i][0] * 10 + dominoes[i][1]]++;

			// except for the [2,2] [1,1] [3,3]
			if (dominoes[i][0] != dominoes[i][1]) {
				ans += arr[dominoes[i][1] * 10 + dominoes[i][0]];
			}
		}

		return ans;
	}
}
