public class App {
    public static void main(String[] args) throws Exception {
        // calculateScore("Obed", 10);

        int newScore = calculateScore("Obed", 10);
        System.out.println("New score is " + newScore);

        // call second method overload
        calculateScore(750);

        calculateScore();
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No unnamed player, no scores");
        return 0;
    }
}
