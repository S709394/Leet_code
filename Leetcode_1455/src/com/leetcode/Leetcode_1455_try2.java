//does not works 

package com.leetcode;

public class Leetcode_1455_try2 {
	public static void main(String[] args) {

//		String str = "burger asad", searchWord = "burge"; //works 
//		String str = "i love burger", searchWord = "burge";
		
		//"hellohello hellohellohello"

		String str = "hellohello hellohellohello", searchWord = "ello";
		
		System.out.println(isPrefixOfWord(str, searchWord));

	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		int senIdx = 0 ;
		int searchIdx= 0 ;
		
		String trimed = sentence.trim();
		
		int tLen= trimed.length();
//		int res = 1 ;
		int cnt =1;
		
		while (senIdx <tLen ) {
//			System.out.println("searchIdx++//"
//					+ "				senIdx++ : " + searchIdx +"/" +senIdx);
			
			if(searchWord.charAt(searchIdx) ==sentence.charAt(senIdx) ) {
				searchIdx++;
				senIdx++;
				
				
			}else {
//				searchIdx=0;
				
				if(senIdx <tLen-1&&sentence.charAt(senIdx) ==' ' ) {
					searchIdx=0;
					cnt++;
					senIdx++;
					System.out.println("cnt:" + cnt);
					while (sentence.charAt(senIdx+1)==' ') {
						senIdx++;
					}
					
				}
				
				do {
					senIdx++;
					
					System.out.println("searchIdx++//"
							+ "				senIdx++ : " + searchIdx +"/" +senIdx);
				} while ( (sentence.charAt(senIdx+1) !=' ') &&senIdx <tLen-1);
				
				
				
			}
			
			
			if(searchIdx==searchWord.length()-1) {
				return cnt;
			}
			
			
		}
		
		return -1 ;
	}
}
