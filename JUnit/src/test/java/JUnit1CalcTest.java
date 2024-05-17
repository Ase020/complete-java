import static org.junit.jupiter.api.Assertions.*;

class JUnit1CalcTest {

    @org.junit.jupiter.api.Test
    void divide() {
        JUnit1Calc calc = new JUnit1Calc();
       int result = calc.divide(10,2);
       int expected = 5;
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        JUnit1Calc calc = new JUnit1Calc();
        int result = calc.multiply(10,2);
        int expected = 20;
        assertEquals(expected,result);
    }
}