package Day8;

import java.util.Scanner;

public class AirthameticOparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=  new Scanner(System.in);
		/*
		 * System.out.println("Enter the value of a : "); int a = scnr.nextInt();
		 * 
		 * System.out.println("Enter the value of b : " ); int b = scnr.nextInt();
		 * 
		 * System.out.println("Enter the Values of c : "); int c = scnr.nextInt();
		 * 
		 * int result = a+b*c; System.out.println("Result : " + result);
		 * 
		 * int max = Math.max(a, Math.max(b, c)); int min = Math.min(b, Math.min(b, c));
		 * 
		 * System.out.println("Maximum :" + max); System.out.println("Minimum :"+ min);
		 * 
		 * 
		 * 
		 */
		
		/*
		 * System.out.println("Enter the value of a : "); double a =scnr.nextInt();
		 * 
		 * System.out.println("Enter the Value of b :"); double b = scnr.nextInt();
		 * 
		 * System.out.println("Enter the value of c : "); double c = scnr.nextInt();
		 * 
		 * double result = c+a/b;
		 * 
		 * double max = Math.max(c, Math.max(a/b, b)); double min = Math.min(c,
		 * Math.min(a/b, b));
		 * 
		 * System.out.println("Maximum:" + max); System.out.println("Minimum : " + min);
		 */
		
//		System.out.print("Enter the value of a: ");
//        int a = scnr.nextInt();
//
//        System.out.print("Enter the value of b: ");
//        int b = scnr.nextInt();
//
//        System.out.print("Enter the value of c: ");
//        int c = scnr.nextInt();
//
//        int result = a % b + c;
//        System.out.println("Result: " + result);
//
//        int max = Math.max(a % b, Math.max(c, b));
//        int min = Math.min(a % b, Math.min(c, b));
//
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);
   
		System.out.println("Enter the value of a :" );
		int a = scnr.nextInt();
		System.out.println("Enter thr value of b: ");
		int b = scnr.nextInt();
		System.out.println("Enter the value of c : ");
		int c= scnr.nextInt();
		
		int result = a*a+b;
		System.out.println("Result: " + result);
		
		int max = Math.max(a*b, Math.max(b*c, c));
		int min = Math.min(a*b, Math.min(b*c, c));
		
		System.out.println("Maximum : " + max);
		System.out.println("minimum : " + min);
		
		
	}

}
