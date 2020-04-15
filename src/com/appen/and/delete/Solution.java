package com.appen.and.delete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
	
	
    
 // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	char [] charS=s.toCharArray();
    	char [] charT=t.toCharArray();
    	int matChLastIndex=0;
    	int deleteCount=0;
    	int appendCount=0;
    	for (int i = 0; i < charS.length; i++) {
			if(i<charT.length&&charS[i]==charT[i]) {
				matChLastIndex=i;
			}else {
				break;
			}
		}
   
    		if(s==t) {
    			deleteCount=s.length();
    			appendCount=t.length();
    		}else {
    			String subStrOfS=s.substring(matChLastIndex+1);
        		deleteCount=subStrOfS.length();
        		if(t.length()>=matChLastIndex+1)
        		appendCount=t.substring(matChLastIndex+1).length();
    		}
    		
    		
    	if(t.length()>s.length()&& deleteCount+appendCount!=k)
    		return "No";
    	if(deleteCount+appendCount<=k)
    		return "Yes";
    	
    	
		return "No";

    }

    
    public static void main(String[] args) {
    	System.out.println(appendAndDelete("y", "yu", 2));;
	}


}
