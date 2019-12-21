import java.util.Scanner;

public class StartFinish {
    /**
     * 5. Input 2 values:  start  and  finish, then display the numbers from start to finish.
     */
    public static void main(String[] args) {

        int[] afiseazaSirul = displayNumbers();
        for (int i = 0; i < afiseazaSirul.length; i++)
            System.out.print(afiseazaSirul[i] + " ");
    }

    public static int[] displayNumbers() {

        Scanner no1 = new Scanner(System.in);
        System.out.println("Insert the value for Start");
        int start = no1.nextInt();

        Scanner no2 = new Scanner(System.in);
        System.out.println("Insert the value for Finish");
        int finish = no2.nextInt();

        if (start > finish) {
            int aux = start;
            start = finish;
            finish = aux;
        }

        int limita = finish - start + 1;
        int sir[] = new int[limita];

        for (int i = 0; i < limita; i++) {
            sir[i] = start;
            start++;
        }

        return sir;


    }
}

