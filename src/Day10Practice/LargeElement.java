package Day10Practice;

public class LargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,64,};
		
		int large = array[0];
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]>large) {
				large =array[i];
			}
			
		}
		System.out.println("show the largest element of array[i] " +large );

	}

}
