import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsLargerTwentyTest {

    @Test
    public void testIsLargerTwenty () {
        //give
        int num = 21;
        //when
        boolean result = IsLargerTwenty.IsLargerTwenty(num);
        //then
        Assertions.assertTrue(result);
    }
}
