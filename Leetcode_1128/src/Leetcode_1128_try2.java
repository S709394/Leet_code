import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// time complexity : O(n) because it iterates through the array once
//space complexity is O(n) because the hashmap stores up to n unique domino pairs.
////Runtime
//16 ms
//Beats
//72.52%
//Memory
//60.6 MB 
//Beats
//12.72%


public class Leetcode_1128_try2 {
	public int numEquivDominoPairs(int[][] dom) {
		int res = 0;

		int dLen = dom.length;

		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < dLen; i++) {
			
			//make sure dom [0] <=  dom [1]
			Arrays.sort(dom[i]);
			/// [0] *10 + [1] is unique
			int key = dom[i][0] * 10 + dom[i][1];

			if (hm.containsKey(key)) {
				if (hm.get(key) > 0) {
					//Just math 
					res += hm.get(key);
				}
				
				
				hm.put(key, hm.get(key) + 1);

			} else {
				hm.put(key, 1);
			}

		}
		return res ;
	}
}
