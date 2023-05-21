package Day8;

public class SpringSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
            System.out.println("Please provide two integer arguments: month and day.");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring = (m == 3 && d >= 20 && d <= 31) ||
                           (m == 4 && d >= 1 && d <= 30) ||
                           (m == 5 && d >= 1 && d <= 31) ||
                           (m == 6 && d >= 1 && d <= 20);

        System.out.println(isSpring);

	}

}
