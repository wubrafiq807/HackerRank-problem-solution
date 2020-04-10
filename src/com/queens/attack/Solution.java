package com.queens.attack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


	/*
	 * queensAttack function below function 
	 * @param int n <an n*n chessboard.>
	 * @param int k <number of obstacles>
	 * @param int r_q <row no.of queens position>
	 * @param int c_q <column no.of queens position>
	 * @param int array obstacles <this is list of obstacles>
	 * */
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		List<Point> AttactablePoint = new ArrayList<Solution.Point>();
		int rightToleft = c_q - 1;	

		Solution solution = new Solution();

		// attack right to left
		while (rightToleft > 0) {
			if (checkObsTacleExist(solution.new Point(r_q, rightToleft), obstacles)) {
				break;
			}
			// right to left
			AttactablePoint.add(solution.new Point(r_q, rightToleft));
			rightToleft--;

		}

		// top to bottom
		int topToBottomRow = r_q - 1;
		while (topToBottomRow > 0) {
			if (checkObsTacleExist(solution.new Point(topToBottomRow, c_q), obstacles)) {
				break;
			}
			// top to bottom
			AttactablePoint.add(solution.new Point(topToBottomRow, c_q));

			topToBottomRow--;

		}
		// bottom to tor attack
		int bottomToTopRow = r_q + 1;
		while (bottomToTopRow <= n) {
			if (checkObsTacleExist(solution.new Point(bottomToTopRow, c_q), obstacles)) {
				break;
			}
			// top to bottom
			AttactablePoint.add(solution.new Point(bottomToTopRow, c_q));

			bottomToTopRow++;

		}
		// attack left to right
		int leftToRight = c_q + 1;
		while (leftToRight <= n) {
			if (checkObsTacleExist(solution.new Point(r_q, leftToRight), obstacles)) {
				break;
			}
			AttactablePoint.add(solution.new Point(r_q, leftToRight));
			leftToRight++;

		}

		// left down corner
		int leftDownRow = r_q - 1, leftDownCol = c_q - 1;
		while (true) {
			if (leftDownRow == 0 || leftDownCol == 0) {
				break;
			}
			if (checkObsTacleExist(solution.new Point(leftDownRow, leftDownCol), obstacles)) {
				break;
			}
			AttactablePoint.add(solution.new Point(leftDownRow, leftDownCol));
			leftDownRow--;
			leftDownCol--;
			if (leftDownRow < 0 || leftDownCol < 0) {
				break;
			}
		}

		// top right corner
		int topRightCornerRow = r_q + 1, topRightCornerCol = c_q + 1;
		while (true) {
			if(topRightCornerRow >n | topRightCornerCol > n) {
				break;
			}
			if (checkObsTacleExist(solution.new Point(topRightCornerRow, topRightCornerCol), obstacles)) {
				break;
			}
			AttactablePoint.add(solution.new Point(topRightCornerRow, topRightCornerCol));
			topRightCornerRow++;
			topRightCornerCol++;

		}

		// top left corner
		int topleftCornerRow = r_q + 1, topleftCornerCol = c_q - 1;
		while (true) {
			if(topleftCornerRow>n | topleftCornerCol == 0) {
				break;
			}
			if (checkObsTacleExist(solution.new Point(topleftCornerRow, topleftCornerCol), obstacles)) {
				break;
			}
			AttactablePoint.add(solution.new Point(topleftCornerRow, topleftCornerCol));
			topleftCornerRow++;
			topleftCornerCol--;

		}
		// bottom right corner
		int bottomRightCornerRow = r_q - 1, bottomRightCornerCol = c_q + 1;
		while (true) {
			if(bottomRightCornerRow==0 ||bottomRightCornerCol>n) {
				break;
			}
			if (checkObsTacleExist(solution.new Point(bottomRightCornerRow, bottomRightCornerCol), obstacles)) {
				break;
			}
			AttactablePoint.add(solution.new Point(bottomRightCornerRow, bottomRightCornerCol));
			bottomRightCornerRow--;
			bottomRightCornerCol++;

		}

		return AttactablePoint.size();
	}
/*
 * 
 * function for checking is the given point is an obstacles.If given point 
 * exist into obstacles array then return true otherwise return false
 * @param Point point 
 * @param int array obstacles <this is list of obstacles>
 * @return boolean
 * @author Md Rafilqul Islam
 * 
 * 
 * */
	static boolean checkObsTacleExist(Point point, int[][] obstacles) {
		for (int[] is : obstacles) {
			if (is[0] == point.x && is[1] == point.y) {
				return true;
			}
		}
		return false;

	}
	
	/*
	 * Custom class for point
	 * */

	class Point {
		int x;
		int y;
		// constructor 

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int k = 3;

		// TODO Auto-generated method stub
		int[][] obstacles = new int[k][2];

		for (int i = 0; i < k; i++) {
			String[] obstaclesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
				obstacles[i][j] = obstaclesItem;
			}
		}

		System.out.println(queensAttack(5, k, 4, 3, obstacles));
	}

}
