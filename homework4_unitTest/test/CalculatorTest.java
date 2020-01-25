import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
   public void getMax() {
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.getMax(),3);
    }
    @Test
    public void getMaxWithNegative() {
        Calculator c = new Calculator(1,2,-3);
        assertEquals(c.getMax(),2);
    }
    @Test
    public void getMaxWithNull() {
        Calculator c = new Calculator(1,2,null);
        assertEquals(c.getMax(),2);
    }
    @Test
    public void getMin(){
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.getMin(),1);
    }    @Test
    public void getMinWithNegatives(){
        Calculator c = new Calculator(1,2,-3);
        assertEquals(c.getMin(),-3);
    }    @Test
    public void getMinWithnull(){
        Calculator c = new Calculator(1,2,null);
        assertEquals(c.getMin(),1);
    }
    @Test
    public void getSum(){
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.getSum(),6);
    }
    @Test
    public void getSumWithNegatives(){
        Calculator c = new Calculator(1,2,-3);
        assertEquals(c.getSum(),0);
    }
    @Test
    public void getSumWithOneNull(){
        Calculator c = new Calculator(1,2,null);
        assertEquals(c.getSum(),3);
    }
    @Test
    public void getAvg(){
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.getAverage(),2);
    }
    @Test
    public void getAvgWithNegatives(){
        Calculator c = new Calculator(1,2,-3);
        assertEquals(c.getAverage(),0);
    }
    @Test
    public void getAvgWithNull(){
        Calculator c = new Calculator(1,null,3);
        assertEquals(c.getAverage(),2);
    }
    @Test
    public void areAllPositiveTrue(){
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.areAllPositive(),true);
    }
    @Test
    public void areAllPositiveFalse(){
        Calculator c = new Calculator(1,2,-3);
        assertEquals(c.areAllPositive(),false);
    }
    @Test
    public void areAllPOsitiveWithNull()
    {
        Calculator c = new Calculator(1,2,null);
        assertEquals(c.areAllPositive(),false);
    }
    @Test
    public void isAEvenFalse(){
        Calculator c = new Calculator(1,2,3);
        assertEquals(c.isAEven(),false);
    }
    @Test
    public void isAEvenTrue(){
        Calculator c = new Calculator(2,1,3);
        assertEquals(c.isAEven(),true);
    }
    @Test
    public void isAEvenWithNull(){
        Calculator c = new Calculator(null,2,3);
        assertEquals(c.isAEven(), false);
    }
}

