//Idea from https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/discuss/414180/Clean-JavaJavaScript-DFS-solution


// hashSet  +  DFS 
package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_1239_try1_dfs {
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
	
	private static int res = 0 ;
	
	public static int maxLength(List<String> arr) {
        //base  
		if (arr== null || arr.size()==0) {
			return 0;
		}
		
		dfs (arr, "" , 0) ;
		return  res;
		
    }
	
	private static void   dfs ( List<String >arr  , String path , int idx)  {
		boolean  isUniqueChar = isUniqueChars ( path);
		System.out.println("call dfs () path :" + path);  // test
		if (isUniqueChar) {
			res =   Math.max(path.length(), res); 
			
//			System.out.println(path);
			System.out.println( "res :" +   res);  // test
		}
		
		if (idx == arr.size() || !isUniqueChars (path)){
			System.out.println( "skip");  // test
			return ;
		}
		
		for (int i = idx ; i < arr.size() ; i ++) {
			System.out.println("in the forloop /// i : " + i);  // test
			dfs(arr , path+arr.get(i) , i +1);
		}
		
		
	}
	
	// check all the chars  are unique 
	private  static boolean isUniqueChars (String s) {
		 Set <Character> set  = new HashSet <>  () ;
		 
		 for (char c : s.toCharArray()) {
			 if (set.contains(c)) {
				  return false ;
			 }
			 set.add(c);
			 
		 }
		 return  true;
		 
	}
	
	 
}
