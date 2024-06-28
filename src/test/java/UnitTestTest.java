import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest {

    @Test
    public void sumTest_when1and2_thenReturn3(){
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int actual = UnitTest.sum(a, b);

        //THEN
        assertEquals(3,actual);
    }

    @Test
    public void isEvenTest_when1_thenReturnFalse(){
        //GIVEN
        int a = 1;

        //WHEN
        boolean actual = UnitTest.isEven(a);

        //THEN
        assertFalse(actual);
    }
}