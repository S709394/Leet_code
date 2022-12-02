package com.leetcode;

//Idea  : https://leetcode.cn/problems/find-common-characters/solution/xian-tong-ji-ge-zi-fu-chuan-zhong-zi-fu-de-shu-lia/

public class Leetcode_1002_try1 {
	public List<String> commonChars(String[] w) {
		int[] startArr = new int[26];

		String startStr = w[0];
		int startLen = startStr.length();
		
		
		// the first word 
		for (int i = 0 ; i < startLen ; i++ ) {
			startArr [startStr.charAt(i) - 'a']  ++ ;
		}
		
		//the 2nd ~len th world 
		for  (int  i = 1 ;  i < w.length ; i ++) {
			String str = w [ i] ;
			
			int [] count   = new int [26] ;
			for (int j =  0 ; j < startStr.length();j++) {
				count [str.charAt(j)-'a']++;
			}
			
			//Store the small
			for (int j= 0 ; j< count.length;j++) {
				if(count[j]<startArr[j]) {
					startArr[j] =count [j];
				}
			}
			
			
			
			
		}
	}

}
