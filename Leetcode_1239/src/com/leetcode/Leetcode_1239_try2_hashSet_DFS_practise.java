package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_1239_try2_hashSet_DFS_practise {
	
	public static void main(String[] args) {
		List <String > arr = new ArrayList <> ( );
		//{"un","iq","ue"}
		
//		arr.add("un");
//		arr.add("iq");
//		arr.add("ue"); 
		arr.add("aa");
		arr.add("bb");
		
		System.out.println( maxLength (arr));
		
		
//		String [] arr = {"un","iq","ue"} ;
	}
	
	private static int  res = 0 ; 
	public static int maxLength(List<String> arr) {
		 if ( arr == null || arr.size() ==0) {
			 return 0 ;
		 }
		 
		 dfs ( arr ,"", 0 );
		 
		 return res ;
		 
	}
	
	
	private static  void  dfs  (List<String> arr , String path , int idx) {
		// Make sure a string have unique chars
		boolean allUniqueChars=  isCharUnique (path);
		
		//
		if( allUniqueChars ) {
			res = Math.max(res, path.length());
		}
		
		//Skip the
		if (idx== arr.size()||!allUniqueChars) {
			return ;
		}
		
		for (int i = idx ; i<arr.size() ; i ++ ) {
			dfs (arr,path+ arr.get(i ), i+1);
		}
		
		
		
	};
	// all the char in the String is unique 
	private static boolean isCharUnique (String s) {
		
		Set <Character> set = new HashSet <> () ; 
		
		for  (char c : s.toCharArray()) {
			
			if(set.contains(c)) {
				return false ;
			}
			
			set.add(c);
		}
		return true;
	}
}
