import java.util.Scanner;
import java.util.Random;
public class numbergame 


{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finalscore = 0;
        boolean playAgain = true;
        System.out.println("Welcome Guys!");
        System.out.println("Hey guy you have about " + chances + " chances to win the game.");
        while(playAgain)
        {
            Random rand = new Random();
            int random = rand.nextInt(100) + 1; // Generates a number from 1 to 100
            boolean guessedCorrectly = false;

            for(int i = 0; i < chances; i++)
            {
                System.out.println("chance " + (i+1) + " Enter your guess: ");
                int userGuess = sc.nextInt();
                if(userGuess==random)
                {
                    guessedCorrectly = true;
                    finalscore+=1;
                    System.out.println("You Won it");
                    break;
                }
                else if (userGuess>random)
                {
                    System.out.println("Too High");
                }
                else
                {
                    System.out.println("Too low");
                }

            }
            if(!guessedCorrectly)
            {
                System.err.println("You lost! The correct number was: " + random);

            }

            System.out.println("Your Current Score: " + finalscore);
            System.out.println("Do you want to play again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");


        }

        System.out.println("Thanks for playing! Final Score: " + finalscore);
        sc.close();
       

    }
}