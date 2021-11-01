public class forLoop {
    public static void main(String[] args) throws Exception {
        // System.out.println("10,000 at 2% interest is: " + calculateInterest(10000.0,
        // 2.0));

        // start from 2% up to 8%
        for (int i = 2; i < 9; i++) {
            System.out.println(
                    "10,000 at " + i + "% interest is: " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("###########################################################");

        // Start from 8% and calculate down to 2%
        for (int i = 8; i > 1; i--) {
            System.out.println(
                    "10,000 at " + i + "% interest is: " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
