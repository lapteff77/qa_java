
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest  {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;


    private String sex;
    private boolean expected;

    public  LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] getLion() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}, // передали тестовые данные
        };
    }

    @Test
    public void shouldLion() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual); 
    }

}



