/**
 * JBC Week 1 Challenge
 * Ksenia Lake
 * October 24, 2019
 */

import java.util.Scanner;
import java.util.Random;

public class JavaWeek1Challenge {
    public static void main(String[] args) {

        /* *****************************
         *            PART 1
         * ****************************/
        // declare + initialize :: part 1 (and some also for part 2)
        Scanner keyboard = new Scanner(System.in);
        int userInt;
        boolean isPrime;

        // request user input
        System.out.println("Hello! Welcome to the prime number game!\nPlease enter an integer greater than 1.");
        userInt = keyboard.nextInt();
        keyboard.nextLine();

        if (userInt > 1) {  // validate input

            if (userInt == 2) { // TWO is a SPECIAL CASE!
                System.out.println(userInt + " is prime!");
            }
            else { // userInt > 2; CHECK IF PRIME

                isPrime = true;   // set flag to true -- our loop will check for false condition

                for (int i = 2; i <= (userInt / 2); i++) {  // only check up to userInt/2 (integer division is okay)
                    if (userInt % i == 0){
                        System.out.println(userInt + " is not a prime number.");
                        isPrime = false;
                        break;
                    }
                } // end prime-checking loop

                // if we have gotten this far and the flag is still true, no number could divide userInt, it is Prime.
                if (isPrime) {
                    System.out.println(userInt + " is prime!");
                }

            } // end 2-not2 if-else

        } else { // user input was not an integer > 1
            System.out.println("Please enter a valid input.");
        }

//        /* *****************************
//         *           PART 2
//         * ****************************/
//        // declare + initialize :: part 2
//        Random randomGenerator = new Random();
//        int start = 1, int end = 250;
//        int randomInt;
//
//        // required outputs:
//        System.out.println(randomInt + " is not a prime number.");
//        // or:
//        System.out.println(randomInt + " is a prime numbwer!");

        /* *****************************
         *       Clean-Up and Exit
         * ****************************/
        System.out.println("Thanks for playing!");
        keyboard.close();

    }  // end main
}
