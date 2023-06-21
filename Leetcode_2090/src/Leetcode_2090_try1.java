import java.util.Arrays;

public class Leetcode_2090_try1 {
	public static void main(String[] args) {

	}

	public int[] getAverages(int[] nums, int k) {
		//try 1 
		int len = nums.length;
		int ans[] = new int[len];
//init 
		Arrays.fill(ans, -1);

		if (len >= 2 * k + 1) {
			long sum = 0;
			for (int i = 0; i < 2 * k; i++) {
				sum += nums[i];
			}
			for (int i = 2 * k; i < len; i++) {

				System.out.println(" i : " + i + "/n k: " + k); // test

				sum += nums[i];

				ans[i - k] = (int) (sum /( 2 * k + 1));
				sum -= nums[i - 2 * k];
			}

		}
		return ans ;
//		
	}
}
