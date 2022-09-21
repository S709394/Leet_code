package com.leetocode;

public class Leetcode_79_dfs_try1 {
	
	// a 2D  bool for  visited world
	
	static boolean [][]visited; 
	
	public boolean exist(char[][] board, String word) {
		
		visited = new  boolean [board.length][ board[0].length];
		
		for (int i = 0 ; i< board.length; i ++) {
			for (int k=0; k < board[0].length;k++) {
				if (word.charAt(0)== board[i][k] && search (board ,word ,i ,k,0)) {
					return true;
				}
			}
		}
		return false;
        
    }
	
	private static boolean  search ( char[][] board,  String word , int i,int k ,int index) {
		
		//end condition 
		if (index == word.length()) {
			return true;
			
		}
		
		if(i<0 | i>=board.length || k<0 || k>=board[0].length|| visited[i][k] || board[i][k]!= word.charAt(index)) {
			return false;
		}
		
		visited[i][k] =true;
		
		if(search(board ,word , i+1,k,index+1) ||
				search(board ,word , i-1,k,index+1) ||
				search(board ,word , i,k+1,index+1) ||
				search(board ,word , i,k-1,index+1) ) {
			return true;
		}
		
		//reset this to the next round 
		visited[i][k] =false;
		
		return false ;
		
	}
}
