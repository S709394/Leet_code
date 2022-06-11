// Some prepare code about how to display the array of list

// The funtions are for  1. create a List of List of integer  2.  to display it  

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1260_prepare_code_list {
	public static void main(String[] args) {
		
//		int [][]gridA={  {1,2,3},{1,2,3},{1,2,3}};
		
		
		int [][]gridA= {};
		
		printListOfList (getListOfList(gridA, 1));
	}
	
	public static List<List<Integer>> getListOfList(int[][] grid, int k) {
//      
//				
		List <List <Integer>> result = new  ArrayList();  
		
		int rows = 4  ,col =3;
		
		for (int r = 0 ; r< rows ;r++) {
			
			result .add(new ArrayList());
			
			for (int i = 0 ; i < col ; i ++) {
				result .get(r).add( i );
			}		
		}
//		System.out.println(result); // does not work
		
		return result;
  }
	
	
	public static void  printListOfList(List<List<Integer>> LL) {
		for (List<Integer> intList : LL ) {
			
			for (Integer i : intList) {
				System.out.print( i + " ,");
			}
			
			System.out.println(" ");
		}
	}
	
	
	
	
//	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
//        
//		
//    }
}
