package Day8;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		/*
		 * System.out.println("Enter the value of a: "); double a = scr.nextDouble();
		 * 
		 * System.out.println("Enter the value of b: "); double b = scr.nextDouble();
		 * 
		 * System.out.println("Enter the Value of c: "); double c = scr.nextDouble();
		 * 
		 * double delta = b*b-4*a*c;
		 * 
		 * if(delta>0) { double root1 = (-b +Math.sqrt(delta))/(2*a); double root2
		 * =(-b-Math.sqrt(delta))/(2*a);
		 * 
		 * System.out.println("Root 1 of x: " + root1);
		 * System.out.println("Root 2 of x: " + root2);
		 * 
		 * } else if (delta ==0) { double root =-b/(2*a);
		 * System.out.println("Root of x: " + root); }else {
		 * System.out.println("no real roots exist."); }
		 * 
		 * scr.close();
		 * 
		 * 
		 */
		
		System.out.print("Enter the value of a: ");
        double a = scr.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scr.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scr.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has a single root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
	}

}
