/*Runtime: 3 ms, faster than 71.68% of Java online submissions for String to Integer (atoi).
Memory Usage: 43 MB, less than 56.81% of Java online submissions for String to Integer (atoi).*/
package com.leetcode;

public class Leetcode_08_try1 {
	
	public static void main(String[] args) {
		String s = "-91283472332";
		System.out.println( myAtoi (s));
	}
	public static int myAtoi(String s) {
// base case 
		if (s == null )
			return 0;
      //  1.  remove the white leading space
		s=s.trim();
        
        if( s.length() == 0)
            return 0;

		int sign = 1; 
		
		// for the    less than - 2 ^31   or   bigger then the 2^31-1      
		long sum = 0;
		int start = 0;
		
		int len = s.length();
		if (s.charAt(0) == '-') {
			sign = -1;
			start++;
		} else if (s.charAt(0) == '+') {
			sign = 1;
			start++;
		}
		
		
		for(int i = start ; i < len ; i ++) {
			if (!Character.isDigit(s.charAt(i))){
				
//				sum= 10*sum+( s.charAt(i)-'0');//
				
				
				return (int) (sum*sign);
			}
			//for  overflow  
			sum= (10*sum+( s.charAt(i)-'0'));
//			System.out.println((int) (10*sum+( s.charAt(i)-'0')));
//			System.out.println("sum"+sum);  //test
			
			if(sign==1&&sum>Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if(sign ==-1 && sum>Integer.MAX_VALUE) return Integer.MIN_VALUE;
		}
//		
		
		return (int) sum*sign;

	}
}
