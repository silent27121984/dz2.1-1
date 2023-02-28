import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests started");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests completed");
    }

    @BeforeEach
    public void beforeEach() {
        calculator = new Calculator();
        System.out.println("Before each test started");
    }

    @AfterEach
    public void afterEach() {
        calculator = null;
        System.out.println("After each test completed");
    }

    @Test
    public void testAddition() {
        int a = 2, b = 2, expected = 4;
        int result = calculator.addition(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        int a = 5, b = 2, expected = 3;
        int result = calculator.subtraction(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        int a = 3, b = 2, expected = 6;
        int result = calculator.multiplication(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        int a = 8, b = 2, expected = 4;
        int result = calculator.division(a, b);
        assertEquals(expected, result);
    }
}