package com.luck.balance;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/*
	 * Function for luckBalance function below
	 * @param int k
	 * @param  int[][] contests <Two dimensional array with contest number and importance>
	 * @return int
	 * @author Md Rafiqul Islam
	 * */
	static int luckBalance(int k, int[][] contests) {
		int countImportant = 0;
		long sum = 0;
		List<Integer> listConTest = new ArrayList<Integer>();
		for (int i = 0; i < contests.length; i++) {
			// check important contest
			if (contests[i][1] == 1) {
				countImportant++;
				// add important contest into array list
				listConTest.add(contests[i][0]);
				
			}

			sum += contests[i][0];
		}
		int winCounter = countImportant - k;
		
// if important contest is not equal to min contest to be passed
		if (countImportant != k) {
			int someValueTobeSkiped = 0;
		// find the minimum numbers list to be skiped
			for (int i = 0; i < winCounter; i++) {
				int min = listConTest.get(0);
				int minIndex = 0;
				// for loop to find the min munber from listConTest array list 
				for (int j = 0; j < listConTest.size(); j++) {
					if (listConTest.get(j) < min) {
						min = listConTest.get(j);
						minIndex = j;
					}					

				}
				// sum value to be calculate 
				someValueTobeSkiped += listConTest.get(minIndex);
				// delete the min value from the listConTest array list 
				listConTest.remove(minIndex);
				
			}
			sum=sum-(someValueTobeSkiped*2);

		}
		return (int) sum;
	}

	public static void main(String[] args) {
		int[][] contests = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
		int k = 3;
		System.out.println(luckBalance(k, contests));
	}

}
