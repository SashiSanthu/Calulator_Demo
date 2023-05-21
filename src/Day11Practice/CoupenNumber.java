package Day11Practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CoupenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] couponNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int totalDistinctCoupons = findDistinctCoupons(couponNumbers);
        System.out.println("Total random numbers needed to have all distinct coupons: " + totalDistinctCoupons);
    }

    public static int findDistinctCoupons(int[] couponNumbers) {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        
        int randomNumbersCount = 0;

        while (distinctCoupons.size() < couponNumbers.length) {
            int randomNumber = generateRandomNumber(couponNumbers.length, random);
            randomNumbersCount++;

            if (!distinctCoupons.contains(randomNumber)) {
                distinctCoupons.add(randomNumber);
            }
        }

        return randomNumbersCount;
    }

    public static int generateRandomNumber(int range, Random random) {
        return random.nextInt(range) + 1;	
      }

}
