import java.util.Random;
import java.util.Scanner;

public class NumberGame {

        public static void main(String[] args) {
                Random r = new Random();
                Scanner input = new Scanner(System.in);

                System.out.println("===================================================================");
                System.out.println("                      Can You Guess It ?                           ");
                System.out.println("===================================================================");
                System.out.println("Only 10 attempts for number guessing");
                System.out.println("Cheack your power of guessing");
                System.out.println("===================================================================");

                char ch;
                int counter = 0;
                int guessedNumber=0;
                do {
                        System.out.flush();
                        int randomNumber = r.nextInt(100)+ 1;
                        System.out.println("\nEnter guess the Number");

                        while (randomNumber != 0) {
                                int inputNumber = input.nextInt();
                                System.out.println();

                                if (inputNumber == randomNumber) {
                                        counter++;
                                        guessedNumber++;
                                        System.out.println("===================================================================");
                                        System.out.println("Congrats! you got number in " + counter + " attempts");
                                        System.out.println( guessedNumber +" number/s are successfully you guess it. ");
                                        System.out.println("===================================================================\n");
                                        counter = 0;
                                        break;                
                                } else if (counter >= 9){
                                        System.out.println("You Fail in guessing number in 10 attempts \n");
                                        counter=0;
                                        break;
                                } else if (inputNumber < randomNumber) {
                                        counter++;
                                        System.out.println("Please enter Higher Number ");
                                } else {
                                        counter++;
                                        System.out.println("Please enter Lower Number ");
                                }
                        }

                        System.out.println("Can you play again? \nEnter 'Y' for YES  \t 'N' for NO");
                        System.out.println("===================================================================");
                        ch = input.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');

        }
}