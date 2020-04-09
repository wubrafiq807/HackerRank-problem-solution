package com.rafiq.solutions;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	 // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int combination=0;
    	for (int i = 0; i < s.size(); i++) {    
    		// in case of single combination
			if(m==1) {
				if(s.get(i)==d) {
					combination++;
				}
				
			}else {
				//in case of multiple combination
				try {
					int sum=0;
					for (int j = i; j <=i+m-1; j++) {
						if(j<s.size()) {
							sum+=s.get(j);
						}
						
					}
					if(sum==d) {
						combination++;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
				}
			}
		}
		return combination;


    }
    
    public static void main(String[] args) {
    	// sample input 
    	Integer[] arra= {1, 1, 1, 1, 1,1};
    	int m=2,d=3;
    	System.out.println(birthday(Arrays.asList(arra), d, m));
	}
}
