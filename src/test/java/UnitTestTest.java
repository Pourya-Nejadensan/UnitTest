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

    @Test
    public void multipleTest_when2and2_thenReturn4(){
        //GIVEN
        int a = 2;
        int b = 2;


        //WHEN
        int actual = UnitTest.multiple(a, b);

        //THEN
        assertEquals(4, actual);
    }
}