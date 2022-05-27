package leetcode_340;

//LEETCODE 340. Longest substring in string S with at most K distinct characters//


// 2 parameters    int k   ;   String  s

/*		int num=lengthOfTheSubstringKDisinct("aa",1);  ///  should return 2 
//     int num=lengthOfTheSubstringKDisinct("eceba",2);	  //  return 3
*/

// note :  not fully understand 

import java.util.HashMap;
import java.util.Map;

public class lengthOfSubstring { //asdadsxxz13123
	
	public static void main(String[] args) {
//		int num=lengthOfTheSubstringKDisinct("avadaxxd",2);
		
		
//		int num=lengthOfTheSubstringKDisinct("aa",1);  /// 2 
//		int num=lengthOfTheSubstringKDisinct("eceba",2);	  // 3
		
		
		
//		int num=lengthOfTheSubstringKDisinct("aacbaaabbbc",2);   //7
		
		int num=lengthOfTheSubstringKDisinct("ab000bbb000ab0",2);   //10
		
//		String str=  "abbbacdefg";
//		int num=lengthOfTheSubstringKDisinct(str,3);   //6
		
//		int num=lengthOfTheSubstringKDisinct("abbbacdefg",3);   //6
		
		System.out.println(num);
	}
	
	
	public static int lengthOfTheSubstringKDisinct(String s, int k){
		
		//1 . if s.length()==0
		
		if(s.length()==0 || k==0) {
			return 0;
		}
		
		//2 
		
		char [] arr = s.toCharArray();
		
		int distinct =0;  // counter of the type of charters
		
		Map<Character, Integer> count =new HashMap <Character, Integer>();
		
		int left =0;
		int res = 0;
		
		for (int right =0; right<arr.length   ;right++) {
			
			char rightChar =arr[right];
			
			System.out.println("right char : "+rightChar); //test
			int c =count.getOrDefault(rightChar, 0);// todo
			
			
			//see a new character the first time 
			if(c==0) {
				distinct++;
				
			}
			
			count.put(rightChar, c+1);
			
//			System.out.println("c+1 : "+(c+1));//test
//			System.out.println("distinct : "+distinct);//test
			
			/////
			if(distinct<=k) {
				res=Math.max(res,right-left+1);
				System.out.println("max : "+res);//test
			}else {
				while (distinct>k) {
					char leftChar=arr[left];
					System.out.println("left char xxxxxxxxxxxxxx: "+leftChar);
					int leftCount =count.getOrDefault(leftChar, 0);
					
					count.put(leftChar,leftCount-1);
					
					if(leftCount-1==0) {
						distinct--;
//						System.out.println("distinct : "+distinct);//test
					}
					left++;
//					System.out.println("left num : "+left); //test
				}
			}
			
			
		}
		
		
		return res;
	}
}
