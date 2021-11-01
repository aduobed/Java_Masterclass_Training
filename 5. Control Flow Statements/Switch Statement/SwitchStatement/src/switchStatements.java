public class switchStatements {
    public static void main(String[] args) {
        // int switchValue = 4;

        // switch (switchValue) {
        // case 1:
        // System.out.println("Value is 1");
        // break;
        // case 2:
        // System.out.println("Value is 2");
        // break;
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("was a 3, or 4, or a 5");
        // System.out.println("actually was a " + switchValue);
        // break;

        // default:
        // System.out.println("Value is not 1 or 2");
        // break;
        // }

        // Challenge time

        // char switchChar = 'h';

        // switch (switchChar) {
        // case 'a':
        // case 'b':
        // case 'c':
        // case 'd':
        // case 'e':
        // System.out.println("Character found was " + switchChar);
        // break;

        // default:
        // System.out.println("Not Found!");
        // break;
        // }

        // switching between months and converting to lower case

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;

            case "february":
                System.out.println("feb");
                break;

            default:
                System.out.println("Month not found!");
                break;
        }

    }
}
