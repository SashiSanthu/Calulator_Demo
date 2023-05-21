package Day11Practice;

public class FebonocySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10; // Number of terms in the series

        // Print Fibonacci series
        System.out.println("Fibonacci series:");
        printFibonacciSeries(count);
    }

    // Method to print the Fibonacci series
    public static void printFibonacciSeries(int count) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term in the series
            int nextTerm = firstTerm + secondTerm;

            // Update the values of firstTerm and secondTerm for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

	}


