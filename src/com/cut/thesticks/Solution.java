package com.cut.thesticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

	/*
	 * Function for permutationEquation
	 
	 * @param int[] arr
	 * 
	 * @return int []
	 * 
	 * @author Md Rafiqul Islam
	 */

	// Complete the cutTheSticks function below.
	static int[] cutTheSticks(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		// array list for element after  every iteration
		List<Integer> afterDeleted = new ArrayList<Integer>();
		while (true) {
			// check for distinct values
			if (list.stream().distinct().count() == 1) {
				afterDeleted.add(list.size());
				break;

			}		
			
			afterDeleted.add(list.size());
			
			int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
			list = list.stream().filter(x -> x > min).collect(Collectors.toList());

			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) - min);

			}
			list = list;

		}

		return afterDeleted.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int[] p = { 8, 8, 14, 10, 3, 5 ,14, 12 };
		System.out.println(cutTheSticks(p));
	}

}
