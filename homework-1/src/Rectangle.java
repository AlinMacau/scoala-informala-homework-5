import java.time.Period;
import java.util.Scanner;

public class Rectangle {
    /**
     * 3. Input the dimensions of a rectangle(Length, Width) and display area and perimeter.
     * Produce an error message if the length or width are negative.
     */
    public static void main(String[] args) {
        System.out.println(calculateAreaAndPerimeter());

    }

    public static String calculateAreaAndPerimeter() {

        Scanner length = new Scanner(System.in);
        System.out.println("Insert the Length of the rectangle");
        int L = length.nextInt();

        Scanner width = new Scanner(System.in);
        System.out.println("Insert the Width of the rectangle");
        int W = width.nextInt();

        int Area = 0;
        int Perimeter = 0;

        if (L < 0 || W < 0) {
            return ("The Length or Width cannot be negative!");
        } else {
            Area = L * W;
            Perimeter = L * 2 + W * 2;

            return ("The Area of the rectangle is " + Area + " and the Perimeter is " + Perimeter);

        }
    }
}
