package com.apjfsa;

import java.util.Scanner;

public class AverageCalculator {
	public static void main (String[] args) {
		//Creating  object for scanner class
		Scanner sc = new Scanner(System.in);
		
		//declaration of array
		int numbers[];
		int index, sum;
		float average;// declaring a variable
		sum =0;
		
		//initializing the length
		numbers = new int[15];
		
		System.out.println("Enter any 15 numbers:");
		
		//Taking unput through the keyboard
		for (index = 0; index < numbers. length; index++) {
			numbers[index] = sc.nextInt();
		}
		
		//Displaying the array elements
		for (index =0; index < numbers.length; index++) {
			sum +=numbers[index];
		}
		average = sum / numbers.length; 
		//displaying the average
		System.out.println("\n average=" + average);
	}
}
		


