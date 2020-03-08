import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Biathlon Brasov2020 = new Biathlon();
        Brasov2020.createAthletes();
        Brasov2020.standingCalculation();
        System.out.println(Brasov2020.initialList.get(0).getAthleteName());

    }
}