import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biathlon {
    List<Athlete> initialList = new ArrayList<>();

    public List<Athlete> createAthletes() throws IOException {
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
                LocalTime SkiTimeResult = LocalTime.of(0, minutes, seconds);
                LocalTime InitialTime = LocalTime.of(0, minutes, seconds);
                String ShootingRange1 = athlete[4];
                String ShootingRange2 = athlete[5];
                String ShootingRange3 = athlete[6];

                Athlete a = new Athlete(AthleteNumber, AthleteName, CountryCode, SkiTimeResult, ShootingRange1,
                        ShootingRange2, ShootingRange3, InitialTime);
                a.TimeCalculator();
                initialList.add(a);
            }
        }
        return initialList;
    }

    public List standingCalculation() {
        TimeComparator t = new TimeComparator();
        Collections.sort(initialList, t);
        System.out.println("Winner - " + initialList.get(0).getAthleteName() + " " + initialList.get(0).getSkiTimeResult() + " (" + initialList.get(0).getInitialTime() + " + " + initialList.get(0).getCounter() + ")");
        System.out.println("Runner-up -  " + initialList.get(1).getAthleteName() + " " + initialList.get(1).getSkiTimeResult() + " (" + initialList.get(1).getInitialTime() + " + " + initialList.get(1).getCounter() + ")");
        System.out.println("Third place -  " + initialList.get(2).getAthleteName() + " " + initialList.get(2).getSkiTimeResult() + " (" + initialList.get(2).getInitialTime() + " + " + initialList.get(2).getCounter() + ")");

        return initialList;
    }
}
