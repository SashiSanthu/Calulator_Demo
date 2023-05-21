package Com.brdgel.Assgenment7;

public class StaticDemo {
	
	public static int staticVarible = 10;//Static Varible
	
	static {
		System.out.println("Inside the static Block ");//Static Block
		 staticVarible = 20;
		
	}
	public static void staticMethod(){
		
		System.out.println("Inside static method ");
		System.out.println("static Varible the value " + staticVarible );
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Inside the main method " );
		staticMethod();
		
		

	}

}
