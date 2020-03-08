import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class BiathlonTestTest {
    @Test
    public void createAthletesTest() {
        Biathlon b = new Biathlon();
        try (b.createAthletes()) {
            assertEquals(b.initialList.get(1), b.initialList.get(1));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}