	package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_138_try1 {
	// no idea of this question so far 
	
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
	public static void main(String[] args) {
		
	}
	
	public Node copyRandomList(Node head) {
        traverse(head);
        return originToClone.get(head);
    }

   
	
	// record DFS the node that traveled  ( not  repeat the same node
    HashSet<Node> visited = new HashSet<>();
   
    HashMap<Node, Node> originToClone = new HashMap<>();

   
    void traverse(Node node) {
        if (node == null) {
            return;
        }
        if (visited.contains(node)) {
            return;
        }
        
        visited.add(node);
        
        if (!originToClone.containsKey(node)) {
            originToClone.put(node, new Node(node.val));
        }
        Node cloneNode = originToClone.get(node);

        

        traverse(node.next);
        cloneNode.next = originToClone.get(node.next);

        traverse(node.random);
        cloneNode.random = originToClone.get(node.random);
    }
}
