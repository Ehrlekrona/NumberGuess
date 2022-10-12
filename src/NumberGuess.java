import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[]args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        while (true){
        System.out.println("Enter your guess(0-10)");

        Scanner scanner = new Scanner(System.in);
        int playerGuess = scanner.nextInt();

        if (playerGuess == randomNumber) {
            System.out.println("Correct! You win! ");
            break;
        }
            else if(randomNumber > playerGuess)
            System.out.println("Incorrect. The number is higher! Guess again.");

            else {
            System.out.println("Incorrect. The number is Lower! Guess again. ");

        }}}}
