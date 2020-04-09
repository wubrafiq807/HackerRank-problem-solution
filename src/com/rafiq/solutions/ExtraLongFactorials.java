package com.rafiq.solutions;

import java.math.BigInteger;

public class ExtraLongFactorials {
	// Complete the extraLongFactorials function below.
	static void extraLongFactorials(int n) {
		// initialized one as factorial 
		BigInteger factorial = BigInteger.ONE;	
		for (int i = n; i > 0; i--) {
			factorial=factorial.multiply(BigInteger.valueOf(i));

		}
		System.out.println(factorial);

	}

	public static void main(String[] args) {
		extraLongFactorials(25);
	}
}
