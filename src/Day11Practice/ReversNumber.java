package Day11Practice;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=12345;
		int reverseno=0;
		
		while(no!=0) {
			int remainder = no%10;
			
			reverseno=reverseno*10+remainder;
			no=no/10;
		}
		System.out.println("Reversed Number: "+ reverseno);
		
		

	}

}
