package Com.brdgel.Assgenment7;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 20001;
		boolean isLeapYear = false;
		if(year >= 1582) {
			if(year%4==0) {
				if(year%100!=0 || year % 400==0) {
					isLeapYear = true;
				}
			}if(isLeapYear) {
				System.out.println(year + "is leap year ");
			}else {
				System.out.println(year + "is not a leap year ");
			}
		}

	}

}
