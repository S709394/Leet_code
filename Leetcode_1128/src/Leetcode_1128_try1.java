//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class Leetcode_1128_try1 {
	public static void main(String[] args) {

	}

	public int numEquivDominoPairs(int[][] dominoes) {

//		1 <= dominoes[i][j] <= 9

// all we need s is 9 * 9
		int[] arr = new int[100];

		int dLen = dominoes.length;

		int ans = 0;
		for (int i = 0; i < dLen; i++) {

			// sort it to make sure d [0] always < d[i] ;
			Arrays.sort(dominoes[i]);
			ans += arr[dominoes[i][0] * 10 + dominoes[i][1]]++;
		}

		return ans;
	}

}
