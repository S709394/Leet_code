package com.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_981_try1 {
	public static void main(String[] args) {
		//try1 

		// https://leetcode.com/problems/time-based-key-value-store/solutions/244229/java-beats-100/

	}

	class Data {

		String val;
		int time;

		Data(String val, int time) {
			this.val = val;
			this.time = time;
		}
	}

	class TimeMap {

		Map<String, List<Data>> map;

		public TimeMap() {
			map = new HashMap<String, List<Data>>();
		}

		public void set(String key, String value, int timestamp) {
			if (!map.containsKey(key)) {
				map.get(key).add(new Data(value, timestamp));
			}
		}

		// use binary Search
		public String get(String key, int timestamp) {
			/// try
			if (!map.containsKey(key)) {
				return "";
			}

			return binarySearch(map.get(key), timestamp);

		}

		protected String binarySearch(List<Data> list, int time) {
			int low = 0, high = list.size() - 1;

			while (low < high) {
				int mid = low + (high - low) / 2;
				if (list.get(mid).time <= time) {
					low = mid;
				} else {
					high = mid + 1;
				}

			}
			return list.get(low).time <= time ? list.get(low).val : "";
		}

	}

}
