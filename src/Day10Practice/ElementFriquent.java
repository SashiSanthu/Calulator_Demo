package Day10Practice;

import java.util.HashMap;
import java.util.Map;

public class ElementFriquent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,5,6,7,1,2,4};
		
		Map<Integer,Integer> frequentelement = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			
			int element = array[i];
			if(frequentelement.containsKey(element)) {
				int  frequancy = frequentelement.get(element);
				
				frequentelement.put(element, frequancy+1);
			}else {
				
				frequentelement.put(element, 1);
					
				
			}
			
			
		}
      for (Map.Entry<Integer, Integer> entry : frequentelement.entrySet()) {
          int element = entry.getKey();
          int frequency = entry.getValue();
          System.out.println("Element: " + element + ", Frequency: " + frequency);
		
	}
	}
	}


