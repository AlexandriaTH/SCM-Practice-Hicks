import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class calculatorTest {

    @Test
    public void add() {
        calculator calc = new calculator();
        calc.addition(21,1);
        assertEquals(22, calc.addition(21,1));
    }

    @Test
    public void subtract() {
        calculator calc = new calculator();
        calc.subtraction(21, 1);
        assertEquals(20, calc.subtraction(21,1));
    }

    @Test
    public void multiply() {
        calculator calc = new calculator();
        calc.multiplication(9,9);
        assertEquals(81, calc.multiplication(9,9));
    }

    @Test
    public void divide() {
        calculator calc = new calculator();
        calc.division(21,9);
        assertEquals(3, calc.division(21,9));
    }

    @Test
    public void squareNumber() {
        calculator calc = new calculator();
        calc.square(10);
        assertEquals(100, calc.square(10));
    }
}