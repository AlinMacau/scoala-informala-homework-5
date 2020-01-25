package ex4;

import java.util.Scanner;

/** 4. Average calculation
 - write a program that calculates the average of all the numbers in an int[] array.
 The user must input the length of the array and each number in the array, after which the average is displayed.
 The array input and average calculation must be implemented in separate methods.
 */

public class AverageCalculator {
    public static void main(String[] args) {//printing the result

        System.out.println("The average is " + avgCalculation());

    }

    public static double[] arrayInput(){
        //input the length of the array
        Scanner input1 = new Scanner(System.in);
        System.out.println("We will calculate the average of all numbers from the array");
        System.out.println("Input the length of the array");
        int length = input1.nextInt();

        double array[] = new double[length];
        //input the numbers and saving them in the array
        for (int i = 0; i < length ; i++) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Input a number");
            array[i] = input2.nextDouble();
        }

        return array;
    }

    public static double avgCalculation(){
        double[] array = arrayInput();
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];//finding  the sum of the elements
        }
        double avg = sum / array.length;//finding the average and returning the result
        return avg;
    }
}
