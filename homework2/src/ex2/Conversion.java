package ex2;

import java.util.Scanner;

 /**2. Fahrenheit to Celsius Conversion
 - create a method that converts temperature from Fahrenheit to Celsius.
 - write a program that for a given (by the user) body temperature, measured in Fahrenheit degrees,
 outputs it in Celsius degrees, with the following message: "Your body temperature in Celsius degrees is X",
 where X is respectively the Celsius degrees. In addition if the measured temperature in Celsius is higher
 than 37 degrees, the program should warn the user that they are ill, with the following message "You are ill!".
 ( use the method created before)
 */

public class   Conversion {
    public static void main(String[] args) {//input the temperature
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert the body temperature (Fahrenheit degrees)");
        double Fahrenheit = input.nextDouble();

        convertTemp(Fahrenheit);
    }

    private static void convertTemp(double Fahrenheit){//calculating and returning the temp + a message

         double Celsius = ((Fahrenheit - 32) / 1.8);

         if(Celsius <= 37) {
             System.out.println("Your body temperature in Celsius degrees is " + Celsius);
         }
         else{
             System.out.println("Your body temperature in Celsius degrees is " + Celsius);
             System.out.println("You are ill!");
         }
     }
}
