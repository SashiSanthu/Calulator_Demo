package Day10Practice;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 8, 2, 10, 3}; 

      
        int smallest = array[0];

                for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                
                smallest = array[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);

	}

}
