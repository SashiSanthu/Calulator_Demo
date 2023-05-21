package Day11Practice;

public class PerfectNumber {
	
    public static void main(String[] args) {
        int number = 29; // Example number

        // Check if the number is a Perfect Number
        boolean isPerfect = isPerfectNumber(number);

        // Print the result
        if (isPerfect) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }

    // Method to check if a number is a Perfect Number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find the divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }


}
