import java.util.Random;

public class DiceGame {

    public void run() {
        int die1 = random();
        int die2 = random();

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1 + die2));
    }

    public static int random() {
        return new Random().nextInt(6) + 1;
    }

    public static void main(String[] args) {
        new DiceGame().run();
    }
}