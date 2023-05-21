package Com.brdgel.Assgenment1;
public class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring = false;

        // Check if month and day fall within the spring season
        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20)) {
            isSpring = true;
        }

        System.out.println(isSpring);
    }
}
