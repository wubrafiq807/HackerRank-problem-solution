package com.rafiq.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nonDivisibleSubset {
	
	 /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    	int[] remains=new int[k];
        for (int i=0;i<s.size();i++){
            remains[s.get(i)%k]++;
        }
        int result=0;
        if (remains[0]>0){
            result++;
        }
        for (int i=1;i<remains.length;i++){
            if(i==(k-i)){
                result++;
            }else {
                if (remains[i]>=remains[k-i]){
                    result+=remains[i];
                }else {
                    result+=remains[k-i];
                }
                remains[i]=0;
                remains[k-i]=0;
            }
        }
        return result;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sample input 
    	Integer[] s= {278, 576, 496, 727, 410, 124, 338, 149, 209, 702 ,282, 718, 771, 575, 436};
    	int k=7;
		System.out.println(nonDivisibleSubset(k, Arrays.asList(s)));

	}

}
