package com.rafiq.hackkerrank;

public class BreakingRecords {
	
	
	static int[] breakingRecords(int[] scores) {
		// initialized max score as first index of array
		int max=scores[0];		
		// initialized min score as first index of array
		int min=scores[0];
		// initialized best and worst broke as 0 times  
	    int brokBestCount=0,brokWorstCount=0;
		for (int i = 0; i < scores.length; i++) {
			// condition for breaking times of best score
			if(scores[i]>max) {
				max=scores[i];
				brokBestCount++;
			}
			// condition for breaking time for worst score
			if(scores[i]<min) {
				min=scores[i];
				brokWorstCount++;
			}
			
		}
		// making result int array and  assign brok best count as first index and worst count as second index  
		int result[]= {brokBestCount,brokWorstCount};
		
		return result;


    }
	
	public static void main(String[] args) {
		//here is the sample array 
		int[] arra= {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		System.out.println(breakingRecords(arra));
	}

}
