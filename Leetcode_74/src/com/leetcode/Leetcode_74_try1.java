
/*Idea:
 * Use a function to get the   the  [i,j]  from the 2D Matrix
 * 
 * */
package com.leetcode;

public class Leetcode_74_try1 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		
		int left = 0 , right = m * n -1;
		
		
		
		while (right >=left) {
			int mid =  left + (right-left)/2;
			if(getInt(matrix,mid)==target) {
				return true;
//			}else if (mid >target) {// wrong 
			}else if (getInt(matrix,mid) >target) {
				right = mid-1;
			}else if (getInt(matrix,mid) <target){
				left = mid +1;
			}
		}
		
		return false;
	}

	// get the int use index
	public static int getInt(int[][] matrix, int index) {

		int m = matrix.length;
		int n = matrix[0].length;

		int i = index / n, j = index % n;

		return matrix[i][j];
	}

}
