
public class Leetcode_673_try1 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 4, 7 };
		System.out.println(findNumberOfLIS(nums));
	}

	public static int findNumberOfLIS(int[] nums) {
		//try1  does not works 
		// longest len increasing subsequence end at i
		
		int n = nums.length;
		
		
		//longest   subsequence   length 
		int max = 0 ;
		int[] len = new int[n];
		int[] cnt = new int[n];
		
		for (int i = 0 ; i < n ; i ++) {
			for (int j = i -1 ; j >=0 ; j --) {
				
				//test 
				System.out.println("i :" + i  + " /n j :" + j); //test 
				
				 // if combining with i makes an increasing subsequence
				if (nums[j] < nums [i]) {
					
				}else {
					 // if combining with i makes a longer increasing subsequence
					if(len[j] +1 > len [i] ) {
						len [i] = len[j] +1 ;
						cnt [i] = cnt [j]; 
						
						 // if combining with i makes another longest increasing subsequence
					}else if ( len[j] +1 == len [i] ) {
						cnt [i] += cnt [j] ;
					}
				}
				
			}
			if (len[i] == 0) {
                len[i] = 1;
                cnt[i] = 1;
            }
		}
		
		int res = 0 ;
		for (int i = 0  ;i  <  n ;  i ++ ) {
			if (len [i] ==max) {
				res += cnt [i];
			}
		}
		return res ;

	}
}
