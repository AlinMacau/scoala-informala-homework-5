package ex1;

import java.util.Scanner;

/**1. Calculate Max
     - Create a method getMax() with two integer (int) parameters, that returns maximal of the two numbers.
     - Write a program that reads three numbers from the console and prints the biggest of them.
     Use the getMax() method you just created.
      */

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //reading three numbers
        System.out.println("Calculate max of three numbers");
        System.out.println("Insert the first number");
        int number1 = input.nextInt();

        System.out.println("Insert the second number");
        int number2 = input.nextInt();

        System.out.println("Insert the third number");
        int number3 = input.nextInt();

        int max1 = getMax(number1,number2);
        int max = getMax(max1, number3);

        System.out.println("The maximum number is " + max);
    }
    public static int getMax(int n, int m){//finding the max of two numbers
        if (n > m){
            return n;
        }
        else {
            return m;
        }
    }
}
