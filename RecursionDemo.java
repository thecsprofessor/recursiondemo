// Name: Dr. Jonathan Cazalas
// Date: 9/13/2023
// Introduction to Recursion...

import java.util.*;

public class RecursionDemo {

    static void showMenu() {
        System.out.println("\n|-----------------------------------------------|");
        System.out.println("|------          Recursion Menu           ------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   1.  Infinite WHILE loop (no recursion)      |");
        System.out.println("|   2.  Recursion without stopping case         |");
        System.out.println("|   3.  Countdown (Iterative)                   |");
        System.out.println("|   4.  Countdown (Recursive)                   |");
        System.out.println("|   5.  Factorial                               |");
        System.out.println("|   6.  Bunny Ears                              |");
        System.out.println("|   7.  Fibonacci                               |");
        System.out.println("|   8.  Quit                                    |");
        System.out.println("|-----------------------------------------------|\n");
    }

    static void infiniteLoop() {

    }

    static void infiniteRecursion() {

    }

    static void countDownIterative(int count) {

    }

    static void countDownRecursive(int n) {

    }

    public int fact(int n) {
       return 1; // only here so program compiles
    }

    static int bunnyEars(int numBunnies) {
        return 1; // only here so program compiles
    }

    static int fib(int n) {
        return 1; // only here so program compiles
    }

    // readAndVerifyMenuChoice()
    // Parameters:  Scanner
    // Return type: int
    // Description: reads and verifies user input as a valid menu selection
    //              method returns user selection as an int once verified
    // -------
    public static int readAndVerifyMenuChoice(Scanner in) {
        String inputLine;
        int choice;

        while (true) {
            System.out.print("> Please enter your choice: ");
            inputLine = in.nextLine();

            if ((inputLine.length() == 1 && Character.isDigit(inputLine.charAt(0))) || (inputLine.length() == 2 && Character.isDigit(inputLine.charAt(0)) && Character.isDigit(inputLine.charAt(1)))) {
                choice = Integer.parseInt(inputLine);
                if (choice >= 1 && choice <= 12) {
                    return choice;
                }
                else {
                    System.out.println("\n   ERROR: invalid input. You must integer a valid integer selection from the menu.\n");
                }
            }
            else {
                System.out.println("\n   ERROR: invalid input. You must integer a valid integer selection from the menu.\n");
            }
        }
    }

    // readAndVerifyYNchoice()
    // Parameters:  Scanner
    // Return type: char
    // Description: reads and verifies user input as a valid choice (Y or N)
    //              method returns user selection as a char once verified
    // -------
    public static char readAndVerifyYNchoice(Scanner in) {
        String inputLine;

        while (true) {
            System.out.print("> Are you sure??? (Y/N): ");
            inputLine = in.nextLine();

            if (inputLine.equalsIgnoreCase("y") || inputLine.equalsIgnoreCase("n")) {
                return inputLine.toUpperCase().charAt(0); // returns choice is an uppercase character
            }
            else {
                System.out.println("\n   ERROR: invalid input. You must enter \"Y\" or \"N\".\n");
            }
        }
    }

    //**************************************************************************//
    //**********                         MAIN                         **********//
    //**************************************************************************//
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userChoice;
        char ynChoice;

        do {
            showMenu();
            userChoice = readAndVerifyMenuChoice(in);

            if (userChoice == 1) {
                ynChoice = readAndVerifyYNchoice(in);
                if (ynChoice == 'Y' || ynChoice == 'y') {
                    System.out.println("> Your call. Press enter for endless fun...");

                    // Just pausing execution...waiting for user to press "Enter", which we then consume
                    in.nextLine();
                    infiniteLoop();
                }
                else {
                    System.out.println("> Smart choice. Who really wants to run an infinite loop anyway.?.");
                }
            }
            else if (userChoice == 2) {
                ynChoice = readAndVerifyYNchoice(in);
                if (ynChoice == 'Y' || ynChoice == 'y') {
                    System.out.println("> Your call. Press enter for \"endless\" fun...although, bummer, it does end...");

                    // Just pausing execution...waiting for user to press "Enter", which we then consume
                    in.nextLine();
                    infiniteRecursion(1);
                }
                else {
                    System.out.println("> Smart choice. Who really wants to run an infinite loop anyway.?.");
                }
            }
            // Count Down (Iterative)
            else if (userChoice == 3) {
                countDownIterative(10);
            }
            // Count Down (Recursive)
            else if (userChoice == 4) {
                countDownRecursive(10);
            }
            // Factorial
            else if (userChoice == 5) {
                System.out.println("\nFACTORIAL");
                System.out.printf("   Enter an integer: ");
                int num = Integer.parseInt(in.nextLine());
                System.out.printf("   The fact of %d is %d.\n\n", num, fact(num));
            }
            // Bunny Ears
            else if (userChoice == 6) {
                System.out.println("\nBUNNY EARS");
                System.out.printf("   Enter the number of bunnies in the line: ");
                int numBunnies = Integer.parseInt(in.nextLine());
                System.out.printf("   Given %d bunnies, the number of bunny ears is %d.\n\n", numBunnies, bunnyEars(numBunnies));
            }
            // Fibonacci
            else if (userChoice == 7) {
                System.out.println("\nFACTORIAL");
                System.out.printf("   Which Fibonacci number do you want? ");
                int num = Integer.parseInt(in.nextLine());
                System.out.printf("   fib(%d) is %d.\n\n", num, fib(num));
            }
            // Quit...
            else if (userChoice == 8) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                // Per the readAndVerifyMenuChoice() method...this ELSE option will NEVER happen
                System.out.println("\nInvalid Selection. Please try again.\n");
            }

        } while (true);

        // close Scanner
        in.close();

    } // END main()
}
