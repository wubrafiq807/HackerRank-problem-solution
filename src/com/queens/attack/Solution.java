package com.queens.attack;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < bill.size(); i++) {
			if (k != i)
				sum = sum.add(BigInteger.valueOf(bill.get(i)));

		}
		BigInteger Bactual = sum.divide(BigInteger.valueOf(2));
		BigInteger dif = BigInteger.valueOf(b).subtract(Bactual);
		if (dif == BigInteger.ZERO) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(dif);
		}

	}

	public static void main(String[] args) {
		
		Integer[] s= {278, 576, 496, 727, 410, 124, 338, 149, 209, 702 ,282, 718, 771, 575, 436};
    	int k=1;
    	int b=4000;
    	bonAppetit(Arrays.asList(s), k, b);

	}

}
