/*200. Number of Islands
Medium

13963

331

Add to List

Share
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
Accepted
1,597,267
Submissions
2,944,717
 * */
/*
 * */
/* Idea  :  
 * a.Found "1"     
 * b.  count ++
 * c.  "Remove "  that Island   '1'=0;
 * d :found another  
 */
package com.leetcode;

public class Try1_leetcode_200 {
	
	public static int numIslands(char[][] grid) {
		
		int count =0;
        for (int i =0;i<grid.length;i++) {
        	for (int j =0;i<grid[0].length;i++) {
        		if(grid[i][j]=='1') {
//        			grid[i][j]='0';
        			dsfFill(grid , i , j);
        			count ++;
        		}
        		
        		
        	}
        }
		
		
		return count;
    }
	
	public static void dsfFill(char[][]grid, int i ,int j ) {
		if(i>=0 && j>=0 && i<grid.length &&j<grid[0].length&&grid[i][j]=='1') {
			grid[i][j]='0';
			dsfFill(grid,i+1,j);
			dsfFill(grid,i-1,j);
			dsfFill(grid,i,j+1);
			dsfFill(grid,i,j-1);
		}
	}
}
