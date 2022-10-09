//dfs  : https://leetcode.cn/problems/island-perimeter/solution/dao-yu-de-zhou-chang-by-leetcode-solution/

//Idea:  Not that clear so far 


// case A  

/*
[

[0,1,0,0],
[1,1,1,0],
[0,1,0,0],
[1,1,0,0]
]

It is the same as   

[
[2,2,2,2,2,2]
[2,0,1,0,0,2],
[2,1,1,1,0,2],
[2,0,1,0,0,2],
[2,1,1,0,0,2],
[2,2,2,2,2,2]
]

*/


package com.leetcode;

public class Leetcode_463_try1_dfs {
	public int islandPerimeter(int[][] grid) {
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				if (grid[r][c] == 1) {
					return dfs(grid, r, c);
				}
			}
		}
		
		//never reach here 
		return 0;
	}

	public static int dfs(int[][] grid, int r, int c) {
		
		// move from  a '1'  to a '2'
		if (!(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length)) {
			return 1;
		}
		// from  '1' to the water '0'
		if (grid[r][c] == 0) {
			return 1;
		}
		// '1' to the pos that visited  '2'
		if (grid[r][c] != 1) {
			return 0;
		}
		grid[r][c] = 2;

		return dfs(grid, r + 1, c) 
				+ dfs(grid, r - 1, c) 
				+ dfs(grid, r, c + 1) 
				+ dfs(grid, r, c - 1);
	}
}
