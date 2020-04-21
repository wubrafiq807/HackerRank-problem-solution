package com.insertion.sort.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static <T> boolean areAllUnique(List<T> list) {
		Set<T> set = new HashSet<>();
		return list.stream().allMatch(t -> set.add(t));
	}

	static void insertionSort1(int n, int[] arr) {
		int lastVal = arr[n - 1];
		int i = n - 2;
		int k = n - 1;
		int last = arr[n - 1];
		while (true) {
			if (k < 0) {
				break;
			}

			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
			if (k != n - 1 && areAllUnique(list)) {
				break;
			}			
			if (i < 0) {
				arr[0] = last;
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				break;
			}
			if (arr[i] > lastVal) {
				int val = arr[i];
				int index = i + 1;
				for (int j = 0; j < arr.length; j++) {
					if (j == index) {
						arr[j] = val;
					}
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			if (arr[i] < lastVal) {
				arr[i + 1] = lastVal;
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}

			i--;
			k--;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 9, 13, 22, 27, 35, 46, 51, 55, 83, 87, 23 };
		insertionSort1(14, arr);
	}

}
