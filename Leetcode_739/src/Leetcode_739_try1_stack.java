//Runtime: 193 ms, faster than 35.57% of Java online submissions for Daily Temperatures.
//Memory Usage: 134.2 MB, less than 22.91% of Java online submissions for Daily Temperatures.
import java.util.Stack;

public class Leetcode_739_try1_stack {
	public static void main(String[] args) {
		 int  [] temperatures = {73,74,75,71,69,72,76,73};
		 
		 System.out.println( dailyTemperatures (temperatures));
	}

	public static int[] dailyTemperatures(int[] temperatures) {
		
		Stack <Integer> s = new Stack <> ();
		
		int len = temperatures.length;
		int [] res = new int [len];
		
		
		for (int i = len - 1; i >=0; i --) {

			while (!s.isEmpty()&&temperatures[ s.peek()]<=temperatures[i]) { 
//			while (!s.isEmpty()&& s.peek()<=temperatures[i]) { //wrong 
				s.pop();
			}
			if( !s.isEmpty()) {
				res[i]= 0;
			}else {
				res[i] = s.peek()-i;
			}
			
					
					
			s.push(i);
		}
		
		return res;
		
	}
}
