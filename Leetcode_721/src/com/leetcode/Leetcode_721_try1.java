package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//
public class Leetcode_721_try1 {
	public static void main(String[] args) {

	}

	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		Map<String, Set<String>> graph = new HashMap<>(); // <email node ,neibo
		Map<String, String> name = new HashMap<>();

		for (List<String> account : accounts) {
			String userName = account.get(0);

			for (int i = 1; i < account.size(); i++) {
				if (!graph.containsKey(account.get(i))) {

					graph.put(account.get(i), new HashSet<>());
				}
				name.put(account.get(i), userName);

				// always skip the (i==1)
				if (i == 1) {
					continue;
				}
				graph.get(account.get(i)).add(account.get(i - 1));
				graph.get(account.get(i - 1)).add(account.get(i));

			}

		}

	}
}
