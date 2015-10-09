import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Sugarcoder on 10/7/2015.
 */

public class Calculator {
    public static void main(String[] args) {


        menu();

        Scanner selection = new Scanner(System.in);


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
                System.out.println("Thanks for using my calculator! The program will end now.");
                break;
            default:
                System.out.println("Invalid. Please select a choice.");
                break;
        }

    }


    private static void menu() {
        System.out.println("Welcome to Miki's Handy Calculator!\n");
        System.out.println("Please select a choice: \n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 = Multiplication \n" +
                "4 - Division \n" +
                "5 - Exit");
    }



    private static void addition() {
        int add1;
        int add2;
        int add3;

        Scanner adding = new Scanner(System.in);
        add1 = adding.nextInt();
        add2 = adding.nextInt();

        add3 = add1 + add2;
        
        System.out.println("Sum of entered numbers is " + add3 + "\n");
        System.out.println("******************** \n");

        menu();
    }



    private static void subtraction() {
        int sub1;
        int sub2;
        int sub3;

        Scanner subtracting = new Scanner(System.in);
        sub1 = subtracting.nextInt();
        sub2 = subtracting.nextInt();

        sub3 = sub1 - sub2;

        System.out.println("Sum of entered numbers is " + sub3 + "\n");
        System.out.println("******************** \n");

        menu();
    }




    private static void multiplication() {
        double mult1;
        double mult2;
        double mult3;

        Scanner multiplying = new Scanner(System.in);
        mult1 = multiplying.nextInt();
        mult2 = multiplying.nextInt();

        mult3 = mult1 * mult2;

        System.out.println("Sum of entered numbers is " + mult3 + "\n");
        System.out.println("******************** \n");

        menu();
    }



    private static void division() {
        double div1;
        double div2;
        double div3;

        Scanner dividing = new Scanner(System.in);
        div1 = dividing.nextInt();
        div2 = dividing.nextInt();

        div3 = div1 / div2;

        System.out.println("Sum of entered numbers is " + div3 + "\n");
        System.out.println("******************** \n");

        menu();
    }





}
