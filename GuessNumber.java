import java.util.*;

public class GuessNumber
{
  public static void main(String[] args){
     Random rand = new Random();
     int answer = rand.nextInt(100) + 1;
     int tries = 0;


     Scanner sc = new Scanner(System.in);
     int guess;
     boolean win = false;

     System.err.println("Answer: " + answer);

     System.out.println("Guess a number ranging from 1-100");


     System.out.println("You only have five tries");
     while (win == false) {
            System.out.print("Input you guess: ");
            guess = sc.nextInt();
            tries++;
             
            if (guess == answer){
                win = true;
                System.err.println("You win! You got the correct number: " + answer);

                }
            else if (guess < answer && guess < 100 && guess > 0){
                     System.out.println("Guess Higher");
            }else if (guess > answer && guess < 100 && guess > 0){
                      System.out.println("Lower your guess");
            }


            if (guess != answer && tries == 5){
               System.err.println("Game over! You lose the game.");
               System.err.println("The correct number: " + answer );
               break;
               }

       }

      }

}
