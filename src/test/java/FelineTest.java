import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testFood() throws Exception {
        List<String> actual = feline.getFood("Хищник");
        MatcherAssert.assertThat(actual, notNullValue());
    }

    @Test
    public void testFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    @Test
    public void testGetKittens() {
        int countResult;
        boolean actualResult;
        boolean expectedResult;
        expectedResult = true;
        countResult = feline.getKittens();
        if (countResult == 1) {
            actualResult = true;
        } else actualResult = false;
        System.out.println(actualResult == expectedResult);
    }
}
