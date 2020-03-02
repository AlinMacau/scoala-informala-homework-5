import java.io.*;
import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
        readAthlete();
    }

    private static void readAthlete() throws IOException {
        try(BufferedReader br = new BufferedReader( new FileReader("results.txt"))){
            while(br.readLine() != null){
                String[] input = br.readLine().split(",");
                int AthleteNumber = Integer.parseInt(input[0]);
                String AthleteName = input[1];
                int CountryCode = Integer.parseInt(input[2]);
                System.out.println( input[3].split(":"));
//                LocalTime SkiTimeResult = new LocalTime( input[3].split(":"));
            }
        }
    }
}
