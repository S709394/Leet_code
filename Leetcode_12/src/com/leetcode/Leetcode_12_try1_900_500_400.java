//Runtime: 4 ms, faster than 99.95% of Java online submissions for Integer to Roman.
//Memory Usage: 45.4 MB, less than 62.02% of Java online submissions for Integer to Roman.


package com.leetcode;

public class Leetcode_12_try1_900_500_400 {
	public static void main(String[] args) {
		
	}
	
	static int [] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	static String [] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	public String intToRoman(int N) {
//        int [] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String [] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder sb = new StringBuilder ();
		
		for (int i = 0 ; N > 0 ; i ++) {
			
			while (N>=val[i]) {
				sb.append(roman[i]);
				N-= val[i];
			}
			
		}
		
		return sb.toString();
        
        
    }
	
}
