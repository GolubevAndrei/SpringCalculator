package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.skyprospringcalculator.Exeption.DevideByZeroExeption;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;


public class CalculatorServiceTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void plusTest() {
        Number actual = calculatorService.plus(2, 3);
        assertThat(actual).isEqualTo(5);

        actual = calculatorService.plus(-3, 1);
        assertThat(actual).isEqualTo(-2);
    }

    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(2, 3);
        assertThat(actual).isEqualTo(-1);

        actual = calculatorService.minus(-3, 1);
        assertThat(actual).isEqualTo(-4);
    }

    @Test
    public void multiplyTest() {
        Number actual = calculatorService.multiply(2, 3);
        assertThat(actual).isEqualTo(6);

        actual = calculatorService.multiply(-3, 1);
        assertThat(actual).isEqualTo(-3);
    }

    @Test
    public void dividePositiveTest() {
        Number actual = calculatorService.divide(3, 2);
        assertThat(actual).isEqualTo(1.5);

        actual = calculatorService.divide(-3, 1);
        assertThat(actual).isEqualTo(-3D);
    }

    @Test
    public void divideNegativeTest() {
        assertThatExceptionOfType(DevideByZeroExeption.class)
                .isThrownBy(() -> calculatorService.divide(3, 0))
                .withMessage("Делить на ноль нельзя");

        assertThatExceptionOfType(DevideByZeroExeption.class)
                .isThrownBy(() -> calculatorService.divide(-3, 0))
                .withMessage("Делить на ноль нельзя");
    }
}
