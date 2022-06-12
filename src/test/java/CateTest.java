import com.example.Cat;
import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

public class CateTest {

    Cat cat = new Cat();

    @Test
    public void testFamily() {
        String actual = cat.getSound();
        String expected = "Мяу";
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}
