public class Sum {
    /**
     * 1.	Calculate the sum of the first 100 numbers higher than 0.
     */
    public static void main(String[] args) {

        System.out.println("Suma primelor 100 de numere este " + calculateSum());

    }

    public static int calculateSum() {

        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum = i + sum;
            i = i + 1;
        }
        return sum;
    }
}
