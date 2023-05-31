package com.leetcode;

public class Leetcode_705_try1_booleanArray {
	
	class MyHashSet {
		int size =  1000001 ;
		boolean flag  [] ;
	    public MyHashSet() {
	         flag =  new boolean [size] ;
	    }
	    
	    public void add(int key) {
	        flag [key]=true;
	    }
	    
	    public void remove(int key) {
	    	 flag [key]=false;
	    }
	    
	    public boolean contains(int key) {
	        return flag [key] ;
	    }
	}
}
