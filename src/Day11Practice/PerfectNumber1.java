package Day11Practice;

public class PerfectNumber1 {
	
	public static boolean isPerfectNumber(int number) {
		int sum=0;
		
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
	
	return sum== number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 65;
		if(isPerfectNumber(number)) {
			System.out.println(number+ "is a perfect number.");
		}else {
			System.out.println(number+"is not perfect number");
		}

	}

}
