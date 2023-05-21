package Day10Practice;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 2, 8, 1, 3}; 

        
        int secondLargest = findSecondLargest(array);

      
        System.out.println("The second largest number in the array is: " + secondLargest);
    }

    
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != largest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
	}

}
