public class MainClass {
        public static void main(String[] args) {
            Calculator c = new Calculator(1,2,3);

            System.out.println(c.getMax());
            System.out.println(c.getMin());
            System.out.println(c.getSum());
            System.out.println(c.getAverage());
            System.out.println(c.areAllPositive());
            System.out.println(c.isAEven());
        }
    }

