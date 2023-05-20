package Assignment2;

import java.util.Scanner;

public class AirthmeticOparations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the first number(a)");
		int a= scnr.nextInt();
		
		System.out.println("Enter the second number(b)");
		int b = scnr.nextInt();
		
		System.out.println("Enter the Third number(c)");
		int c = scnr.nextInt();
		
		int result1 = a+b*c;
		int result2 = (a+b)*c;
		
		int max = Math.max(result1, result2);
		int min = Math.min(result1, result2);
		
		System.out.println("result  " + result1);
		System.out.println("result " + result2);
		System.out.println("Max value " + max);
		System.out.println("Min value "+ min);

	}

}
