package com.leetcode;

public class Try1_leetcode_130 {
	public static void main(String[] args) {
		
		//test code 
//		char [][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		
//		char [][] board = {{'O','X','X','O'},{'X','X','X','X'},{'X','X','X','X'},{'O','X','X','O'}};
//		char [][] board = {{'O','X','X','O'},{'X','X','X','X'},{'X','X','O','O'},{'O','X','X','O'}};
		
//		char [][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','O','O','X'},{'X','O','X','X'}};
		
		char [][] board = {{'X','X','X','X'},{'O','X','O','X'},{'O','X','X','O'},{'X','X','X','X'}};
		
		// change the 'O' on board into 'B'
		
		myPrint(board);
		solve(board);
		
//		System.out.println("end");
		myPrint(board);
		
		
	}
	
	//test display code 
	 public static void myPrint( char [][] board) {
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------");
	}
	 
	 public static void solve(char[][] board) {
		 
		 
	        int rows= board.length;
	        
//	       
	        
//	        System.out.println("rows:" + rows);
	        
	        int cols = board[0].length;
//	        System.out.println("cols" + cols);
	        
	        // 1x1 or 2x2 
	        if( rows<=2 || cols<=2){ 
	        	return;
	        }
	        
	       
	        // 1.  1st col and the last col
	        
	        ///xxxxxxxxxx sth wrong here
//	        for (int i=0; i<2;i++) {
	        for (int i=0; i<rows;i++) {
//	        	System.out.println("rows111:" + rows);
//	        	System.out.println("i:" + i);
	        	dfs(board,i,0);
	        	dfs(board,i,cols-1);
	        }
	        
	        // 2.  1st row and the last row
	        for (int j=1; j<cols-1;j++) {
//	        	System.out.println("for222:" + cols);
	        	
	        	dfs(board,0,j);
	        	dfs(board,rows-1,j);
	        }
//	        myPrint(board);//test
	        
	        // 3 make all the remaining 'O' to 'X'
	        for (int i=0; i<rows;i++) {
	        	for(int j =0;j<cols;j++) {
	        		if(board [i][j] =='O') {
	        			board [i][j] ='X';
	        			
	        		}
	        		if(board [i][j] =='B') {
	        			board [i][j] ='O';
	        			
	        		}
	        		
	        	}
	        }
	        
	        
	 }
	 
	 public static void dfs(char[][] board ,int i,int j) {
//		 System.out.println("here is dfs\n i :"+i + " j : " +j);
////		 if(i>=0 && j>=0 && i<board.length &&j<board[0].length&&board[i][j]=='O') {
//		 
////			 if((i<0 ||i>=board.length || j<0||j>=board[0].length)&&board[i][j]=='O') {
		 if(i<0 ||i>=board.length || j<0||j>=board[0].length) {
				
//				 System.out.println("not cool 001");
				 return;
			}
//			 else  if   (board[i][j] =='O'||board[i][j]=='B') {
			  else  if   (board[i][j]=='X') {
				 
				
				 
//				 System.out.println("not cool 002");
				 return;
				 
			 }else {
//				 if((i==0|| i==board.length-1 ||j==0||j==board[0].length-1)&&board[i][j]=='O' ) {
					 if(board[i][j]=='O' ) {
					 
////					 if(board[i][j] =='O'||board[i][j]=='B') return;
//					 
					 board[i][j]='B';
					 dfs(board,i+1,j);
					 dfs(board,i-1,j);
					 dfs(board,i,j+1);
					 dfs(board,i,j-1);
					 
					
					 
			 }
			 
//				 myPrint(board);
			
//			
			 
	 }
	 
	
	 }

}
