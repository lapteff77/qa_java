import com.example.Cat;

import org.hamcrest.MatcherAssert;
import org.junit.Test;



import static org.hamcrest.CoreMatchers.containsString;


public class CateTest {

    Cat cat = new Cat();

    @Test
    public void testFamily() {
        String actual = cat.getSound();
        String expected = "Мяу";
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}
