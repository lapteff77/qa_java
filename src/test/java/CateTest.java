import com.example.Cat;
import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class CateTest {

    Cat cat = new Cat();
    Feline feline = new Feline();


    @Test
    public void testFamily() {
        String actual = cat.getSound();
        String expected = "Мяу";
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    @Test
    public void testCatGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(actual, expected);
    }
}
