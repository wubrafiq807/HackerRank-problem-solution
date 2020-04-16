package com.sequence.equation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	/*
	 * Function for permutationEquation
	 * 
	 * @param int k
	 * 
	 * @param int[] p 
	 * 
	 * @return int []
	 * 
	 * @author Md Rafiqul Islam
	 */

    static int[] permutationEquation(int[] p) {    	
    	Map<Integer, Integer> MapY=new HashMap<Integer, Integer>();
    	int pVal=1;
    	for (int i = 0; i < p.length; i++) {    
    		//Given the values for  p1 ,p2 
    		MapY.put(p[i],pVal);
    	    pVal++;
		}
    	int index=0;
    	for (int i = 1; i <= p.length; i++) {
    		//p(p(y))=x
    		p[index]=MapY.get(MapY.get(i));
			index++;
		}
		return p;
    }

	public static void main(String[] args) {
		int[] p = { 4, 3 ,5 ,1, 2};
		System.out.println(permutationEquation(p));
	}

}
