package ex5;

import java.util.Scanner;

/**5. Duplicate removal
 - write a program that removes all the duplicates found in an int[] array. The user must input the length of the array
 and each number in the array, after which the array without duplicates will be displayed.
 The array input and duplicate removal must be implemented in separate methods.
*/

public class DuplicateRemoval {

    public static void main(String[] args) {
        //finding and printing the arrray
        double[] afiseazaSirul = removeDuplicates();

        for (int i = 0; i < afiseazaSirul.length; i++)
            System.out.print(afiseazaSirul[i] + " ");
    }


    public static double[] arrayInput() {
        //reading the length of the array
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input the length of the array");
        int length = input1.nextInt();

        double array[] = new double[length];
        //reading the elements of the array
        for (int i = 0; i < length; i++) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Input a number");
            array[i] = input2.nextDouble();
        }

        return array;
    }

    public static double[] removeDuplicates(){
        double[] array1 = arrayInput();//the initial array
        int limit = 0;
        double[] array2 = new double[limit];//the new array without duplicates

        int k = 0;
        for (int i = 0; i < array1.length; i++) {//picking element by element from firs array

            int counter = 0;
            int j;

            for (j = 0; j < limit; j++) {//comparing with existing elements from the second array
                if (array2[j] == array1[i]){
                    counter ++;
                }
            }

            if(counter == 0){
                double[] arrayAux = new double[limit];//creating an auxiliary array just to keep array2 while I create another array2 with one more element
                for (int l = 0; l <limit; l++) {
                   arrayAux[l] = array2[l] ;
                }
                limit++;
                array2 = new double[limit];//creating a new array with one more element
                array2[k] = array1[i];//adding the new element
                k++;
                for (int m = 0; m <limit-1 ; m++) {//copying back the elements from the auxiliary array
                    array2[m] = arrayAux[m];
                }
            }
        }
            return array2;
    }

}