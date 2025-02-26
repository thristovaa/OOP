import java.awt.*;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        Random rand = new Random();

        outerloop:
        while (true){
            System.out.println("*************************************************");
            System.out.println("*** Higher! Lower!                            ***");
            System.out.println("*************************************************");

            int number = rand.nextInt(1, 100);
            int guess = 0;

            while (guess != number) {
                System.out.print("Enter a number: ");
                guess = consoleScanner.nextInt();

                if (guess > number) System.out.println("Too high!");
                else if (guess < number) System.out.println("Too low!");
            }

            System.out.println("Guessed!");

            System.out.print("Do you want to play again? (y/n) ");

            String answer = consoleScanner.nextLine();

            innerloop:
            while(true){
                switch (answer){
                    case "n":
                        break outerloop;

                    case "y":
                        break innerloop;

                    default:
                        System.out.println("Please enter a valid answer!");
                        System.out.print("Do you want to play again? (y/n) ");
                        answer = consoleScanner.nextLine();

                }
            }

            System.out.println(" ");
        }
    }
}