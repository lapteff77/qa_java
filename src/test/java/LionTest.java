import com.example.Feline;
import com.example.Lion;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;


    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[] getLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}, // передали тестовые данные
        };
    }

    @Test
    public void shouldLion() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLionCountKittens() throws Exception {
        Lion lion = new Lion(sex);
        int actual = lion.getKittens();
        System.out.println(actual);
    }

    @Test
    public void testFamily() throws Exception {
        Lion lion = new Lion(sex);
        String actual = String.valueOf(lion.getFood());
        String expected = "Животные, Птицы, Рыба";
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}



