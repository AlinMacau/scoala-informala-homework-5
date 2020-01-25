import java.util.Scanner;

public class MaximumNumber {
    /**
     * 4. Input 3 numbers, and display the biggest.
     */
    public static void main(String[] args) {
        System.out.println(findMaximum());
    }

    public static String findMaximum() {

        Scanner no1 = new Scanner(System.in);
        System.out.println("Insert the first number");
        int number1 = no1.nextInt();

        Scanner no2 = new Scanner(System.in);
        System.out.println("Insert the second number");
        int number2 = no2.nextInt();

        Scanner no3 = new Scanner(System.in);
        System.out.println("Insert the third number");
        int number3 = no3.nextInt();

        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return ("The maximum number is " + max);
    }
}
