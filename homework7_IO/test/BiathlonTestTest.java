import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class BiathlonTestTest {
    @Test
    public void createAthletesTest() throws IOException {
        Biathlon b = new Biathlon();
        b.createAthletes();
        assertEquals("Athlete{AthleteNumber=11, AthleteName='Umar Jorgson', CountryCode='SK', " +
                        "ShootingRange1='xxxox', ShootingRange2='xxxxx', ShootingRange3='xxoxo', SkiTimeResult=00:30:57}",
                b.initialList.get(0).toString());
    }

    @Test
    public void standingCalculationTest() throws IOException{
        Biathlon b = new Biathlon();
        b.createAthletes();
        b.standingCalculation();
        assertEquals("Piotr Smitzer",b.initialList.get(0).getAthleteName());
        assertEquals("Jimmy Smiles",b.initialList.get(1).getAthleteName());
        assertEquals("Umar Jorgson",b.initialList.get(2).getAthleteName());
    }

}