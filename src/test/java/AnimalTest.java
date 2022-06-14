import com.example.Animal;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void shouldAnimalGetFamilyTest() throws Exception {
        String actual = String.valueOf(animal.getFamily());
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}
