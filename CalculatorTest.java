import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,  calculator.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5,0));
    }

    @Test
    public void testAddition() {
        assertEquals( "Regular addition should work", calculator.addNumbers(4,5), 9);
    }

    @Test
    public void testSubstraction() throws Exception {
        assertEquals( "Regular substraction should work", calculator.substract(4,5), 1);
    }
    
    @Test
    public void testSubstraction2() throws Exception {
        assertEquals( "Regular substraction should work", calculator.substract(10,5), 5);
    }

    @Test
    public void testSubstractionNegativ() {
        assertEquals( "Negativ substarction should work", calculator.substractNegative(4,5), -1);
    }

    @Test
    public void testDivide() throws Exception {
		assertEquals( "Regular division should work", calculator.divide(10,2), 5);
    }
}