import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void getMax() {
        Calculator c = new Calculator(1,2,3);
        Integer max = c.getMax();
        assertEquals(max,3);
    }
    @Test
    void getMaxWithNegative() {
        Calculator c = new Calculator(1,2,-3);
        Integer max = c.getMax();
        assertEquals(max,2);
    }
    @Test
    void getMaxWithNull() {
        Calculator c = new Calculator(1,2,null);
        Integer max = c.getMax();
        assertEquals(max,2);
    }
    @Test
    void isAEven(){
        Calculator c = new Calculator(1,2,3);
    }
}