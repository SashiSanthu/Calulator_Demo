package Day11Practice;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int number) {
		if(number <=1) {
		return false;
		}
		for (int i = 2; i <number; i++) {
			if(number%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=23;
		if(isPrimeNumber(number)) {
			System.out.println(number+"is a prime number.");
		}else {
			System.out.println(number+"is not a prime number");
		}

	}

}
