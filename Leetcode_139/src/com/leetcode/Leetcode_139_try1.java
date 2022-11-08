// try 
package com.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Leetcode_139_try1 {
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String > set = new HashSet <> () ;
		
		if(s==null ||s.length()==0 || wordDict==null || wordDict.size()==0) {
			return false;
		}
		int sLen = s.length();
		
		boolean [] boolArr = new boolean [sLen+1];
		
		boolArr [0] =true;
		
		int wordMinLen = 0 ; //need to update
		
		for (String word : wordDict) {
			Math.min(wordMinLen, word.length());
			
			
			set.add(word);
		}
//		System.out.println("");
		
		
		for (int i = 1 ; i <= sLen; i++) {
			
			for (int j =i-wordMinLen+1;j>0;j-- ) {  // does not well
				
				boolArr [i] =  boolArr[j-1] && set.contains(s.substring( j-1 ,i) );
				
				if  (boolArr [i]) {
					break ;
				}
			}
			
		}
		return boolArr [sLen];
	}
	
	
	
}
