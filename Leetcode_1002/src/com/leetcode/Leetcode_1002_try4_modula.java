package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//Runtime
//4 ms
//Beats
//88.49%
//Memory
//43.4 MB
//Beats
//67.55%

public class Leetcode_1002_try4_modula {
	public List<String> commonChars(String[] words) {
		int [] resCnts = new int [26]; 
		Arrays.fill(resCnts, Integer.MAX_VALUE);
		
		for (String word:words) {
			toMin(resCnts,word);
		}
		
		//
		List<String> resList=new ArrayList<> ();
		for (int i= 0; i <26; i ++) {
			while (resCnts[i]-- > 0 ) {
				resList .add( String.valueOf((char)i + 'a') );
			}
			
		}
		return  resList ;
		
	}
	//
	
	public int []getCntArr (String word){
		int [] cnt  =new int[26];
		for (int i = 0 ; i < word.length();i++) {
			cnt [word .charAt(i)-'a']++;
		}
		return cnt;
	}
	
	public void toMin(int[]resCnts ,String word) {
		
		int cnt[] =getCntArr (word);
		for (int i = 0 ; i <26;i++) {
			resCnts [i] = Math.min(resCnts [i],cnt[i]); 
		}
	}
}
