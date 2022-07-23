/*797. All Paths From Source to Target
Medium

4573

120

Add to List

Share
Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).

 

Example 1:


Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
Example 2:


Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 

Constraints:

n == graph.length
2 <= n <= 15
0 <= graph[i][j] < n
graph[i][j] != i (i.e., there will be no self-loops).
All the elements of graph[i] are unique.

The input graph is guaranteed to be a DAG.
*/

/*idea  :
https://leetcode.com/problems/all-paths-from-source-to-target/discuss/297408/Java-DFS-solution-Easy-to-understand-and-Explanation

DFS   way  



*/
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_797 {
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> listOflist = new ArrayList<List<Integer>>();
		
		
		List<Integer>  path = new ArrayList <Integer>();
		
		// every path starts as 0;
		path .add(0);
		dfs(graph ,0,path ,listOflist);
		
		
		return listOflist;
		
		
    }
	
	//depth search first
	public static void dfs( int [][] graph, int x,    List<Integer> path ,List<List<Integer>> listOfList) {
		// After add all the path in the list of list
		if(x==graph.length-1) {
			listOfList.add( new ArrayList (path));
			return;
		}
		for(int i = 0 ; i < graph[x].length;i++) {
			path.add(graph[x][i]);
			dfs(graph ,graph[x][i],path ,listOfList);
			path.remove(path.size()-1);
		}
		
		
	}
	
	
	
}
