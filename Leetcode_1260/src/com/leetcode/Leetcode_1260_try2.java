/*1260. Shift 2D Grid
Easy

1406

295

Add to List

Share
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

 

Example 1:


Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]
Example 2:


Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
Example 3:

Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m <= 50
1 <= n <= 50
-1000 <= grid[i][j] <= 1000
0 <= k <= 100
 * */



//0.0     some name   temp[tempRowIndex][tempColIndex]   
//    indexIn1DArray
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1260_try2 {
	public static void main(String[] args) {
		
		// Use the 3x3 example
		int [][]gridA={  {1,2,3},{4,5,6},{7,8,9}};
		
		//k=3
		printListOfList(  shiftGrid  (gridA,3));
	}
	
	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int  row =  grid.length;
		int col = grid[0].length;
		
		
		//// Create temporary array of the same size in which we will add element in new position after k shifting.
		int[] [] temp   =  new int [row][col];
		
		
		// Solution Approach:
        // Assume if we convert given array into 1D Array then shift element to k positions and after shiting all the elements we will again convert 1D Array to our original dimention array.
        
        // Logic for Finding current elements's index in 1D Array after shifting K times : 
        // For current element We will just find that what will be it's index in 1D Array 
        // After for New postion in 1D Array we will shift it k times means we will add K in current index
        // And if new positon in 1D Array get's increased by it's total size, we will modulo it by 1D Array Size
		
		for (int r = 0 ; r < row ; r++) {
			for (int c = 0 ; c <col; c++) {
				
				int indexIn1DArray= (r * col +c +k )  % (row *col);
				int tempRowIndex =indexIn1DArray/ col;
				int tempColIndex =indexIn1DArray% col;
				
				temp [tempRowIndex] [tempColIndex]  = grid [r][c];
			}
			
		}
		
		
		//3  Prepare  List of List
		
		
		List <List <Integer> > result = new ArrayList ();
		for (int r = 0 ; r < row ; r ++) {
			List <Integer>  l=  new ArrayList ();
			
			for (int c = 0 ; c <col ; c++) {
				l.add(temp[r][c]);
			}
			
			result .add(l);
			
			
		}
		
		return result;
	}
	
	
	
	//for test propose
		public static void  printListOfList(List<List<Integer>> LL) {
			for (List<Integer> intList : LL ) {
				
				for (Integer i : intList) {
					System.out.print( i + " ,");
				}
				
				System.out.println(" ");
				
			}
		}
}

/*Another solution :  
 * *
 * Lynn_W   April 10, 2022 9:46 PM
 * https://leetcode.com/problems/shift-2d-grid/discuss/708897/Java-simple-one-loop
 *
 * class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = k % (m * n);
        int start = m * n - k;  // new (0,0) element in old grid 
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m * n;) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int pos = (i + start) % (m * n);
                line.add(grid[pos / n][pos % n]);
                i++;
            }
            res.add(line);
        }
        return res;
    }
}
*/
