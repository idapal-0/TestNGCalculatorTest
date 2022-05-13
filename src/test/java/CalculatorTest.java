import org.testng.Assert;
import org.testng.annotations.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 1 = 3")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.add(2, 1), "2 + 1 should be equal to 3");

    }


    @Test
    @DisplayName("2 - 1 = 1")
    void subtractsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract( 2, 1), "2 - 1 should equal 1");

    }
}