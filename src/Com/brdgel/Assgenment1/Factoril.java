package Com.brdgel.Assgenment1;

public class Factoril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5=> 120; 5*4*3*2*1= 120;
		int no=4;
		int factoril = 1;
		
		for (int k = no; k>1;k--) {
			factoril=k*factoril;
		}
		System.out.println("factorial is : " +factoril );

	}

}
