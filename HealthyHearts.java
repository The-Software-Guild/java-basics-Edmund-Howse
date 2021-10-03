import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your age?");

        int age = -1;
        boolean runningSmoothly = false;

        while (!runningSmoothly) {
            try {
                String input = myScanner.nextLine();
                age = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
            }
            if (age < 0) {
                System.out.println("Please give your age as a non-zero integer");
            } else {
                runningSmoothly = true;
            }
        }

        System.out.println("Thank you!");

        int maxRate = 220 - age;
        float targetMin = Math.round(maxRate * 0.5f * 10f) / 10f;
        float targetMax = Math.round(maxRate * 0.85f * 10f) / 10f;

        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("Your target heart rate zone is " + targetMin + " - " + targetMax + " beats per minute.");
    }

}
