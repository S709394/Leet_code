package com.leetcode;


//Idea  : https://leetcode.cn/problems/rotting-oranges/solution/by-li-yu-yuan-liwx/
//Does not work so far 
public class Leetcode_994_try1 {
//	static int min= 0 ;

	public int orangesRotting(int[][] grid) {

		int n = grid.length;
		int m = grid[0].length;
		int roundPlus2 = 2;

		boolean done = false;

		while (!done) {
//			System.out.println("while"); //test 
			int currRoundPlus2 = roundPlus2;
//			System.out.println(" roundPlus2" + roundPlus2);
//			System.out.println( "currRoundPlus2 " + currRoundPlus2  );
		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (grid[i][j] == 1) {
						if (i > 0 && grid[i - 1][j] == 1) {
							grid[i - 1][j] = currRoundPlus2 + 1;
							roundPlus2 = currRoundPlus2 + 1;
						}
						if (i < n - 1 && grid[i + 1][j] == 1) {
							grid[i + 1][j] = currRoundPlus2 + 1;
							roundPlus2 = currRoundPlus2 + 1;
						}
						if (j < m - 1 && grid[i][j + 1] == 1) {
							grid[i][j + 1] = currRoundPlus2 + 1;
							roundPlus2 = currRoundPlus2 + 1;
						}
						if (j > 0 && grid[i][j - 1] == 1) {
							grid[i][j - 1] = currRoundPlus2 + 1;
							roundPlus2 = currRoundPlus2 + 1;
						}
						}
				}
			}

			// can not found fresh orange near the rotting
			if (roundPlus2 == currRoundPlus2) {
				done =true;
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 1) {
					return -1;
				}
				
			}
		}
		return  roundPlus2 -2 ;
	}

}
