package com.rafiq.solutions;

import java.util.Scanner;

public class DayOfProgrammer {

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {

		String date = "";
		if (year < 1918) { // Julian check for leap year
			date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
		} else if (year == 1918) { // Special case: transition year
			date += "26.09." + year;
		} else { // Gregorian check for leap year
			date += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
		}
		return date;
	}
	
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int year = in.nextInt();
	        String result = dayOfProgrammer(year);
	        System.out.println(result);
	}

}
