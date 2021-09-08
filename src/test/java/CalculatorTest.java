import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        // GIVE
        int a = 1;
        int b = 2;

        // WHEN
        int result = Calculator.add(a, b);

        // EXPECT / THEN
        Assertions.assertEquals(3, result);
    }
}
