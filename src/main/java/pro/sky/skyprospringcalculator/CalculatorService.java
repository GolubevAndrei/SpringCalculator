package pro.sky.skyprospringcalculator;

public interface CalculatorService {
    String calculator();
    String plus(Integer num1, Integer num2);
    String minus(Integer num1, Integer num2);
    String multiply(Integer num1, Integer num2);
    String divide(Integer num1, Integer num2);
}
