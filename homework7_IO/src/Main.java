import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static LocalTime SkiTimeResult;
    private static String ShootingRange1;
    private static String ShootingRange2;
    private static String ShootingRange3;

    public static void main(String[] args) throws IOException {
        List<Athlete> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("homework7_IO/results.txt"))) {
            String input;
            while ((input = br.readLine()) != null) {
                String[] athlete = input.split(",");
                int AthleteNumber = Integer.parseInt(athlete[0]);
                String AthleteName = athlete[1];
                String CountryCode = athlete[2];
                String[] t = athlete[3].split(":");
                int minutes = Integer.parseInt(t[0]);
                int seconds = Integer.parseInt(t[1]);
                SkiTimeResult = LocalTime.of(0, minutes, seconds);
                LocalTime InitialTime = LocalTime.of(0,minutes,seconds);
                ShootingRange1 = athlete[4];
                ShootingRange2 = athlete[5];
                ShootingRange3 = athlete[6];

                Athlete a = new Athlete(AthleteNumber, AthleteName, CountryCode, SkiTimeResult, ShootingRange1,
                        ShootingRange2, ShootingRange3, InitialTime);
                a.TimeCalculator();
                lista.add(a);

            }
        }

        TimeComparator t = new TimeComparator();
        Collections.sort(lista, t);
        System.out.println("Winner - " + lista.get(0).getAthleteName() + " " + lista.get(0).getSkiTimeResult() + " ("+ lista.get(0).getInitialTime() + " + " + lista.get(0).getCounter() +")");
        System.out.println("Runner-up -  " + lista.get(1).getAthleteName() + " " + lista.get(1).getSkiTimeResult() + " (" + lista.get(1).getInitialTime() + " + " + lista.get(1).getCounter() + ")");
        System.out.println("Third place -  " + lista.get(2).getAthleteName() + " " + lista.get(2).getSkiTimeResult() + " (" + lista.get(2).getInitialTime() + " + " + lista.get(2).getCounter() + ")");
    }
}