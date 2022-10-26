package com.leetcode;

public class Leetcode_392_try2_charAt {
	public static void main(String[] args) {
		String s = "abcz", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		int fromIndex = 0;
        for (char c : s.toCharArray()) {
//        	 System.out.println("fromIndex(before/"+fromIndex);
        	 
        	 //v 1.0  
            fromIndex = t.indexOf(c, fromIndex);

//            fromIndex = t.indexOf(c) -fromIndex;
            
            System.out.println("fromIndex(after/"+fromIndex);
            
            fromIndex++;
//            if (fromIndex< 0)
            if (fromIndex< 0) {
            	
                return false;
            }
        }
        return true;
	}

}
