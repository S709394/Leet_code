/*657. Robot Return to Origin
Easy

1799

720

Add to List

Share
There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

 

Example 1:

Input: moves = "UD"
Output: true
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
Example 2:

Input: moves = "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
 

Constraints:

1 <= moves.length <= 2 * 104
moves only contains the characters 'U', 'D', 'L' and 'R'.*/

/*Runtime: 6 ms, faster than 86.48% of Java online submissions for Robot Return to Origin.
Memory Usage: 45.3 MB, less than 29.81% of Java online submissions for Robot Return to Origin.
 * 
 * 
 * */

/*Runtime: 8 ms, faster than 55.22% of Java online submissions for Robot Return to Origin.
Memory Usage: 45.7 MB, less than 11.19% of Java online submissions for Robot Return to Origin.*/
package com.leetcode;

public class Leetcode_657_try1 {
	public static void main(String[] args) {

		String moves = "UD";

		System.out.println(judgeCircle(moves));
	}

	public static boolean judgeCircle(String moves) {
		// v 2.0
		if (moves.length() % 2 == 1) {
			return false;
		}
		// for up and down ;
		int ud = 0;
		// for left and right
		int lr = 0;

		for (char c : moves.toCharArray()) {
			if (c == 'U') {
				ud++;
			} else if (c == 'D') {
				ud--;
			} else if (c == 'R') {
				lr++;
			} else if (c == 'L') {
				lr--;
			}
		}

		return ud == 0 && lr == 0;

	}
}
