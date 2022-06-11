
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
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1260_try1 {
	public static void main(String[] args) {
		
		// Use the 3x3 example
		int [][]gridA={  {1,2,3},{4,5,6},{7,8,9}};
		
		//k=3
		printListOfList(  shiftGrid  (gridA,3));
	}
	
	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int row =   grid.length;
		int col =   grid[0].length;
		
		
		int [][] temp =  new int [row][col];
		
		for ( int i =0; i < row ;i ++) {
			for (int j = 0 ; j<col ; j++) {
							
//				int indexIn1DArray= ((row *i) +j+k) %(row*col); //wrong
				int indexIn1DArray = ((col*i) +j +k) % (row *col);
						
				System.out.println("indexIn1DArray:" +indexIn1DArray); //test 
				
				int tempRowIndex =  indexIn1DArray/col;
				System.out.println(tempRowIndex); //test
				
				int tempColIndex = indexIn1DArray %col;
				System.out.println(tempColIndex); //test
				
				temp[tempRowIndex][tempColIndex] = grid[i][j];	
				System.out.println("grid[i][j]:" +grid[i][j]);
			}
		}
		
		//Then turn temp[][] it into the List of List
		
		List <List <Integer>> result = new  ArrayList();  
		for (int r = 0 ; r< row ;r++) {
			
			List <Integer> list = new ArrayList();
			
			for (int c = 0 ; c < col ; c ++) {
				list.add(temp[r][c]);
			}	
			result .add(list);
		}
		
		return  result;
		
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
