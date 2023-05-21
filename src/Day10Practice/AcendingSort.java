package Day10Practice;

public class AcendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 2, 8, 1, 3}; // Example array

       
        bubbleSort(array);

       
        System.out.println("Sorted array in ascending order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
              if (!swapped) {
                break;
            }
        }

	}

}
