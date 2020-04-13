package com.climbing.theLeaderboard;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class Solution {
	// Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) { 
    	
    	Set<Integer> scortedSet = new HashSet<Integer>();
    	List<Integer> aliceRank=new ArrayList<Integer>();
    	int index=1;
    	for (int i : scores) {
    		scortedSet.add(i);
		}
    	  List<Integer> sortedList = new ArrayList<Integer>(scortedSet);
          Collections.sort(sortedList, Collections.reverseOrder());

          int ind;
          for (int i = 0; i < alice.length; i++) {
              ind = Collections.binarySearch(sortedList, alice[i], Collections.reverseOrder());
              if (ind < 0) {
                  ind = Math.abs(ind);
              } else {
                  ind++;
              }
              aliceRank.add(ind);
          }
    
    	int[] array = new int[aliceRank.size()];
    	for(int i = 0; i < aliceRank.size(); i++) array[i] = aliceRank.get(i);
    	return array;


    }
    
    

	public static void main(String[] args) {
		
		int[] scores= {100,100,50,40,40,20,10};
		int[] alice= {5,25,50,120};
		System.out.println(climbingLeaderboard(scores, alice));
    	
    	
	}

}
