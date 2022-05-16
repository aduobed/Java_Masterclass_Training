public class App {
    public static void main(String[] args) {
        // boolean isAlien = false;

        // if (isAlien == false) {
        // System.out.println("It is not an Alien!");
        // }

        int topScore = 80;
        if (topScore >= 80) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore < secondTopScore && topScore < 100) {
            System.out.println("Greater than second topScore and less than 100");
        }
    }
}
