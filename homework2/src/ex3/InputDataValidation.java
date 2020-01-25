package ex3;

import java.util.Scanner;

/**3. Input Data Validation
 - write a program that asks the user what time it is, by printing on the console "What time is it?".T
 hen the user must enter two numbers – one for hours and one for minutes. If the input data represents a valid time,
 the program must output the message " The time is hh:mm now.", where hh respectively means the hours, and mm – the minutes.
 If the entered hours or minutes are not valid, the program must print the message " Incorrect time!".
 The validation must be implemented in a separate method.
*/

public class InputDataValidation {
    public static void main(String[] args) {//input two numbers for hours and minutes
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it?");

        System.out.println("Input a number for hours");
        int hours = input.nextInt();

        System.out.println("Input a number for minutes");
        int minutes = input.nextInt();

        validateHour(hours, minutes);
    }

    public static void validateHour(int hours, int minutes) {//validating the numbers and printing a message
        if(hours >= 0 && hours <24 && minutes >= 0 && minutes < 60){
            System.out.println("The time is " + hours + ":" + minutes);
        }
        else{
            System.out.println(" Incorrect time!");
        }

    }
}
