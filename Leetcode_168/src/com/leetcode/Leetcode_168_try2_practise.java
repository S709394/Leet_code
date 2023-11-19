package com.leetcode;

public class Leetcode_168_try2_practise extends Leetcode_168_try1 {
	public static void main(String[] args) {

	}

	public String convertToTitle(int cN) {
		//try2 
		 StringBuilder sb = new StringBuilder();

			while (cN > 26) {
				cN--;
				sb.append((char) ('A' + (cN % 26)));
				cN = cN / 26;
			}

			sb.append((char)('A' + (cN % 26)));
			sb.reverse();
			return sb.toString();
	}
}
