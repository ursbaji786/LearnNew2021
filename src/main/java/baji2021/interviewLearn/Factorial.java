package baji2021.interviewLearn;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number for which needs to calculate factorial");
		
		int number = input.nextInt();

		
		//int number = 5; // 0utput is 1 when its 0
		int i, fact =1;
		
		for (i=1; i<=number; i++)
			fact = fact * i;
		System.out.println("factorial of give number is " + fact);
		
		
		
		
		
	}

}
