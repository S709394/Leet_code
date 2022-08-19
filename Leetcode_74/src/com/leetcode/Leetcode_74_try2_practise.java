/*74. Search a 2D Matrix
Medium

9165

296

Add to List

Share
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104*/


/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
Memory Usage: 43 MB, less than 29.44% of Java online submissions for Search a 2D Matrix.*/
package com.leetcode;

public class Leetcode_74_try2_practise {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
	}

	public static  boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix .length;
		int n = matrix[0].length;
		
		
		
		int left = 0 , right =m*n -1;
		
		
		
		while (left <=right) {
			int mid = left +  (right-left)/2;
			if(getInt (matrix,mid) ==target) {
				return true;
			}else if (getInt (matrix,mid) <target){
				left = mid +1;
			}else if (getInt (matrix,mid) >target) {
				right = mid -1;
			}
		}
		
		return false ;
		
	}
	
	public static  int getInt (int[][] matrix, int index) {
		int m = matrix .length;
		int n = matrix[0].length;
		
		int i =  index/n   ,j = index%n;
		
		return matrix [i][j];
		
	}
}
