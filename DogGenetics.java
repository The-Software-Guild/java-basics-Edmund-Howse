import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        // some setup
        Scanner myScanner = new Scanner(System.in);
        Random randomiser = new Random();

        System.out.println("What is your dog's name?");
        String dogName = myScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println("");
        System.out.println(dogName + " is:");
        System.out.println("");

        int total = 0;
        int p1 = randomiser.nextInt(101);
        total += p1;
        int p2 = randomiser.nextInt(101 - total);
        total += p2;
        int p3 = randomiser.nextInt(101 - total);
        total += p3;
        int p4 = randomiser.nextInt(101 - total);
        total += p4;
        int p5 = 100 - total;

        System.out.println(p1 + "% potato-themed wolf,");
        System.out.println(p2 + "% unsure haddock,");
        System.out.println(p3 + "% eclectic corgi,");
        System.out.println(p4 + "% vegan King Charles spaniel,");
        System.out.println(p5 + "% werebeast.");

        System.out.println("");
        System.out.println("Is " + dogName + " really a dog?");
    }
}
