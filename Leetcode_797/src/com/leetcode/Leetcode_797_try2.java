
/*idea  :
https://leetcode.com/problems/all-paths-from-source-to-target/discuss/297408/Java-DFS-solution-Easy-to-understand-and-Explanation

DFS   way  


works well 


*/
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_797_try2 {

	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		path.add(0);
		dfs(graph,  path,0, listOfList);

		return listOfList;

	}

	// public static void dfs
	// List of list , path , and start int x and

	public static void dfs(int[][] graph, List<Integer> path, int x, List<List<Integer>> listOfList) {

		
		//Becareful here
		
//		if (x==graph[x].length-1) {//wrong 
		if (x == graph.length - 1) {
			listOfList.add(new ArrayList(path));
			return;
		}
		for (int i = 0; i < graph[x].length; i++) {
			path.add(graph[x][i]);
			dfs(graph,  path,graph[x][i], listOfList);
			path.remove(path.size() - 1);
		}

	}

}
