import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciCalculatorTest {

    @Test
    public void shouldReturnAlwaysSameValue() {
//        Given
        int resultA = FibonacciCalculator.calculate(1, 2);
//        When
        int resultB = FibonacciCalculator.calculate(1, 2);
//        Then
        assertThat(resultA, is(resultB));
    }

    @Test
    public void shouldReturnSumWhenFor5And10() {
//        Given
        int firstNumber = 5;
        int secondNumber = 10;
        int sum = 20000;
//        When
        int result = FibonacciCalculator.calculate(firstNumber, secondNumber);
//        Then
        assertThat(result, is(3990));
    }

    @Test
    public void shouldReturnSumWhenFor0And1() {
//        Given
        int firstNumber = 1;
        int secondNumber = 2;
        int sum = 20000;
//        When
        int result = FibonacciCalculator.calculate(firstNumber, secondNumber);
//        Then
        assertThat(result, is(3382));
    }
}


