import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsFancyTest {

    @Test
    public void testContainsFancy() {
        //give
    String phrase = "Sentence with fancy";

    //when
    boolean result = ContainsFancy.containsFancy(phrase);

    //then
Assertions.assertTrue(result);

    }
}
