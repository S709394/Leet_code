
public class Leetcode_338_try1 {
	 public int[] countBits(int num) { 
//		 /try1
//		 int len =  
		 int []res = new int [ num+1];  
		 
		 int offSet = 1 ;
		 
		 for (int i = 1 ; i < num +1 ; i ++) {
			 if(offSet*2 == i ) {
				 offSet*= 2 ;
//				 System.out.println( "offSet  :"  +offSet );
			 }
			 
			 res[i]= res[i -offSet]+1 ; 
		 }
		 
		 return  res;
	 }
}
