import org.junit.Test;
import static org.junit.Assert.*;
 
public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(6, Calculator.add(3, 3));
    }
    
    @Test
    public void testSoustraction() {
        assertEquals(2, Calculator.remove(4, 2));
    }
}
   