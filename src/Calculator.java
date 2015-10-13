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


    // Addition method with try/catch.
    // Try/catch has methods for easier code reading.

    private static void addition() {
        try {
            add123();

        } catch (InputMismatchException ex) {
            add456();
        }
    }


    // Methods inside addition methods' try/catch.

    private static void add123(){
        int add1, add2, add3;

        Scanner adding = new Scanner(System.in);
        add1 = adding.nextInt();
        add2 = adding.nextInt();

        add3 = add1 + add2;

        System.out.println("Sum of entered numbers is " + add3 + "\n");
        System.out.println("Press Enter to continue");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

        System.out.println("******************** \n");

        menu();
    }


    private static void add456() {
        int add4, add5, add6;

        System.out.println("Invalid inputs!");
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



    // Subtraction method has try/catch.
    // Try/catch has methods for easier code reading.

    private static void subtraction() {

        try {
            sub123();

        } catch (InputMismatchException ex) {
            sub456();
        }


    }


    // Methods inside subtraction methods' try/catch.

    private static void sub123() {
        int sub1, sub2, sub3;
        Scanner subtracting = new Scanner(System.in);

        sub1 = subtracting.nextInt();
        sub2 = subtracting.nextInt();

        sub3 = sub1 - sub2;

        System.out.println("Sum of entered numbers is " + sub3 + "\n");
        System.out.println("Press Enter to continue");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

        System.out.println("******************** \n");

        menu();
    }


    private static void sub456() {
        int sub4, sub5, sub6;

        System.out.println("Invalid inputs!");
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



    // Multiplication method with try/catch.
    // Try/catch has methods for easier code reading.

    private static void multiplication() {
        try {
            mult123();

        } catch (InputMismatchException ex) {
            mult456();
        }
    }


    // Methods inside multiplication methods' try/catch.

    private static void mult123(){

        double mult1, mult2, mult3;

        Scanner multiplying = new Scanner(System.in);

        mult1 = multiplying.nextInt();
        mult2 = multiplying.nextInt();

        mult3 = mult1 * mult2;

        System.out.println("Sum of entered numbers is " + mult3 + "\n");
        System.out.println("Press Enter to continue");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

        System.out.println("******************** \n");

        menu();
    }


    private static void mult456() {

        double mult4, mult5, mult6;

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



    // Division method has try/catch.
    // Try/catch has methods for easier code reading.

    private static void division() {
        try {
            div123();

        } catch (InputMismatchException ex) {
            div456();
        }

    }


    // Methods inside division methods' try/catch.

    private static void div123() {

        double div1, div2, div3;

        Scanner dividing = new Scanner(System.in);


        div1 = dividing.nextFloat();
        div2 = dividing.nextFloat();



        // Check if user entered 0. If entered 0, throw an error message.

        if(div2 != 0){
            div3 = div1 / div2;
            System.out.println("Sum of entered numbers is " + div3 + "\n");
        }
        else {
            System.out.printf("Cannot divide by zero! \n \n");
        }



        System.out.println("Press Enter to continue");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

        System.out.println("******************** \n");

        menu();
    }


    private static void div456() {
        double div4, div5, div6;
        Scanner dividing = new Scanner(System.in);

        System.out.println("Invalid numbers!");
        System.out.println("Please try again. Enter numbers only.");

        Scanner number = new Scanner(System.in);

        div4 = number.nextFloat();
        div5 = number.nextFloat();


        // Check if user entered 0. If entered 0, throw an error message.

        if(div5 != 0){
            div6 = div4 / div5;
            System.out.println("Sum of entered numbers is " + div6 + "\n");
        }
        else {
            System.out.printf("Cannot divide by zero! \n \n");
        }


        System.out.println("Press Enter to continue");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();

        System.out.println("******************** \n");

        menu();
    }

}
