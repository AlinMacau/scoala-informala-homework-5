import java.util.Scanner;

public class Palindrome {
    /**
     * 2. Check if a number is palindrome (e.g. 1221, 34143)
     */
    public static void main(String[] args) {

        System.out.println(checkPalindrome());
    }

    public static String checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int initialNumber = sc.nextInt();

        int number = initialNumber;
        int reverse = 0;

        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        if (reverse == initialNumber) {
            return ("The number is a palindrome");
        } else {
            return ("The number is not a palindrome");
        }
    }
}
