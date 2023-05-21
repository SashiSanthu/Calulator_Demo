package Com.brdgel.Assgenment1;

public class EvenOdd {
	
	//50,48,46,.......8,6,2
	
	static boolean isEven(int n){
		return n%2==0;
		
	}
	static void sayHello(String name){
		System.out.println("Hello "+ name);
		
	}
	///salary * 20% increment
	   // 100 ==> 120
	static double getSalaryIncrement(double salary) {
		return salary*1.20;
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double incSalary =getSalaryIncrement(20000);
	System.out.println("Hiked salary : " + incSalary);
	boolean no=isEven(5);
	System.err.println(no);
	
	System.out.println("Santhu");
	System.out.println("keera");

	}

}
