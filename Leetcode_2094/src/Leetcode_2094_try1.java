import java.util.ArrayList;
import java.util.List;

public class Leetcode_2094_try1 {
	public static void main(String[] args) {
		int nums [] = {1,3,5,2};
		
		System.out.println(findEvenNumbers (nums));
	}
	public static  int[] findEvenNumbers(int[] digits) {
		int[] cnts = new int[10];

		for (int i : digits) {
			cnts[i]++;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 1000; i += 2) {
			int  [] curCnts = new int[10];

			String numStr = i + "";

			// ( 3 digits )
			// the cnt of the digits
			for (int j = 0; j < 3; j++) {
				
				
				curCnts[numStr .charAt(j) -'0']++;
			}

			boolean isVaild = true;

			for (int j = 0; j < cnts.length; j++) {
				if (curCnts[j] > cnts[j]) {
					isVaild = false;
					break;
				}
			}
			if (isVaild) {
				list.add(i);
			}

		}
		int[] res = new int[list.size()];

		for (int j = 0; j < list.size(); j++) {
			res[j] = list.get(j);
		}

		return res;
	}
}
