import org.junit.jupiter.api.Test;

import static java.lang.Integer.sum;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest {

    @Test
    public void sumTest_when1and2_thenReturn3(){
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int actual = sum(a, b);

        //THEN
        assertEquals(3,actual);
    }
}