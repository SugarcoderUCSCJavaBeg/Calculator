import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Sugarcoder on 10/7/2015.
 */

public class Calculator {
    public static void main(String[] args) {

        menu();

        boolean quit = false;
        Scanner selection = new Scanner(System.in);

            while(!quit) {
                switch (selection.nextInt()) {
                    case 1:
                        System.out.println("Please enter two numbers to add, separated by a space: ");
                        addition();
                        break;
                    case 2:
                        System.out.println("Please enter two numbers to subtract, separated by a space: ");
                        subtraction();
                        break;
                    case 3:
                        System.out.println("Please enter two floats to multiply, separated by a space: ");
                        multiplication();
                        break;
                    case 4:
                        System.out.println("Please enter two floats to divide, separated by a space: ");
                        division();
                        break;
                    case 5:
                        System.out.println("Thanks for using my calculator! The program will quit now.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid! Please select a choice.");
                        break;
                }

            }
        }



    private static void menu() {

        System.out.println("Welcome to Miki's Handy Calculator!\n");
        System.out.println("Please select a choice: \n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication \n" +
                "4 - Division \n" +
                "5 - Quit");
        }




    private static void addition() {
        int add1, add2, add3, add4, add5, add6;

        Scanner adding = new Scanner(System.in);

        try {
            add1 = adding.nextInt();
            add2 = adding.nextInt();

            add3 = add1 + add2;

            System.out.println("Sum of entered numbers is " + add3 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();

        } catch (InputMismatchException ex) {
            System.out.println("Invalid numbers!");
            System.out.println("Please try again. Enter numbers only.");

            Scanner number = new Scanner(System.in);

            add4 = number.nextInt();
            add5 = number.nextInt();

            add6 = add4 + add5;

            System.out.println("Sum of entered numbers is " + add6 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();
        }

    }


    private static void subtraction() {
        int sub1, sub2, sub3, sub4, sub5, sub6;

        Scanner subtracting = new Scanner(System.in);

        try {
            sub1 = subtracting.nextInt();
            sub2 = subtracting.nextInt();

            sub3 = sub1 - sub2;

            System.out.println("Sum of entered numbers is " + sub3 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();

        } catch (InputMismatchException ex) {
            System.out.println("Invalid numbers!");
            System.out.println("Please try again. Enter numbers only.");

            Scanner number = new Scanner(System.in);

            sub4 = number.nextInt();
            sub5 = number.nextInt();

            sub6 = sub4 - sub5;

            System.out.println("Sum of entered numbers is " + sub6 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();
        }

    }




    private static void multiplication() {
        double mult1, mult2, mult3, mult4, mult5, mult6;

        Scanner multiplying = new Scanner(System.in);

        try {
            mult1 = multiplying.nextInt();
            mult2 = multiplying.nextInt();

            mult3 = mult1 * mult2;

            System.out.println("Sum of entered numbers is " + mult3 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();

        } catch (InputMismatchException ex) {
            System.out.println("Invalid numbers!");
            System.out.println("Please try again. Enter numbers only.");

            Scanner number = new Scanner(System.in);

            mult4 = number.nextFloat();
            mult5 = number.nextFloat();

            mult6 = mult4 * mult5;

            System.out.println("Sum of entered numbers is " + mult6 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();
        }

    }



    private static void division() {
        double div1, div2, div3, div4, div5, div6;

        Scanner dividing = new Scanner(System.in);

        try {
            div1 = dividing.nextFloat();
            div2 = dividing.nextFloat();

            div3 = div1 / div2;

            System.out.println("Sum of entered numbers is " + div3 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();

        } catch (InputMismatchException ex) {
            System.out.println("Invalid numbers!");
            System.out.println("Please try again. Enter numbers only.");

            Scanner number = new Scanner(System.in);

            div4 = number.nextFloat();
            div5 = number.nextFloat();

            div6 = div4 / div5;

            System.out.println("Sum of entered numbers is " + div6 + "\n");

            System.out.println("Press Enter to continue");

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();

            System.out.println("******************** \n");

            menu();
        }

    }


}
