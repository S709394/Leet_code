package com.leetcode;



//Idea : 
// Muti  is the times that   len / (2*k)  

// reverse the  first half char[]   'muti' times 


//Runtime
//2 ms
//Beats
//82.50%
//Memory
//43.5 MB
//Beats
//77.72%
public class Leetcode_541_try2_practise {
	public static void main(String[] args) {

//		String str = "aabbcccc";
//		String str = "aabbccccaabbc";

		String str = "aab00ccccceeaffggggg1123";
		int k = 5;
		
//		String str = "aa00ccccppffgggg";
//		int k = 4;
//		
//		String str = "aa00aac";
		
//		String str = "abcdefg";
//		
//		String str = "abccabb";
//		int k =2 ; 
		
		
//		String str = "abcdefg";
		
//		String str = "aasccc";
//		int k = 5;

		char[] arr = str.toCharArray();
//		partReverse(0, 2, arr);

//		System.out.println(arr);
		System.out.println(str);
		System.out.println(reverseStr( str,  k));
		
		
		
	}
	public static String reverseStr(String s, int k) {
		int len = s.length();
		char [] cArr = s.toCharArray();
		
		int muti = len /(k *2 ) ;
		
		//first part 
		int firstPartEndIdx = muti * 2 *k -1;
		
		for (int i =0 ; i <  muti * 2 *k  ; i += (2*k)) {
			
			
			partReverseStr (i ,i +k-1 ,cArr);
		}
		
		//second part
		
		//Not sure **************** 
		int lastReverseEndIdx =   Math.min(firstPartEndIdx + k, len-1);
		
		partReverseStr (firstPartEndIdx+1 ,lastReverseEndIdx ,cArr);
				
				
		return new String (cArr);
		
	}
	
	public static void partReverseStr (int l , int r , char [] cArr) {
		char temp = ' ' ;
		while (l < r ) {
			temp = cArr[l];
			cArr[l]=cArr[r];
			cArr[r]=temp;
			
			
			l++;
			r--;
		}
		
		
//		for (int i = left  ; i < right ; i ++) {
//			
//		}
		
//		return new String (cArr );
	}
}
