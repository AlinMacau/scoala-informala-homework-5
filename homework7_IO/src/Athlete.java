import java.time.LocalTime;

public class Athlete {
    int AthleteNumber;
    String AthleteName;
    String CountryCode;
    String ShootingRange1;
    String ShootingRange2;
    String ShootingRange3;
    LocalTime SkiTimeResult;
    int counter;
    LocalTime InitialTime;

    public Athlete(int AthleteNumber, String AthleteName, String CountryCode, LocalTime SkiTimeResult, String ShootingRange1,
                   String ShootingRange2, String ShootingRange3, LocalTime InitialTime) {
        this.AthleteNumber = AthleteNumber;
        this.AthleteName = AthleteName;
        this.CountryCode = CountryCode;
        this.ShootingRange1 = ShootingRange1;
        this.ShootingRange2 = ShootingRange2;
        this.ShootingRange3 = ShootingRange3;
        this.SkiTimeResult = SkiTimeResult;
        this.InitialTime = InitialTime;
    }

    public LocalTime TimeCalculator() {

        for (int i = 0; i < ShootingRange1.length(); i++) {
            if (String.valueOf(ShootingRange1.charAt(i)).equals("o")) {
                SkiTimeResult = SkiTimeResult.plusSeconds(10);
                counter += 10;
            }
        }
        for (int i = 0; i < ShootingRange2.length(); i++) {
            if (String.valueOf(ShootingRange2.charAt(i)).equals("o")) {
                SkiTimeResult = SkiTimeResult.plusSeconds(10);
                counter += 10;
            }
        }
        for (int i = 0; i < ShootingRange3.length(); i++) {
            if (String.valueOf(ShootingRange3.charAt(i)).equals("o")) {
                SkiTimeResult = SkiTimeResult.plusSeconds(10);
                counter += 10;
            }
        }
        return SkiTimeResult;
    }

    public int getAthleteNumber() {
        return AthleteNumber;
    }

    public String getAthleteName() {
        return AthleteName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getShootingRange1() {
        return ShootingRange1;
    }

    public String getShootingRange2() {
        return ShootingRange2;
    }

    public String getShootingRange3() {
        return ShootingRange3;
    }

    public LocalTime getSkiTimeResult() {
        return SkiTimeResult;
    }

    public int getCounter() {
        return counter;
    }

    public LocalTime getInitialTime() {
        return InitialTime;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "AthleteNumber=" + AthleteNumber +
                ", AthleteName='" + AthleteName + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", ShootingRange1='" + ShootingRange1 + '\'' +
                ", ShootingRange2='" + ShootingRange2 + '\'' +
                ", ShootingRange3='" + ShootingRange3 + '\'' +
                ", SkiTimeResult=" + SkiTimeResult +
                '}';
    }
}
