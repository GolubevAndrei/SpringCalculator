package pro.sky.skyprospringcalculator;

public interface CalculatorService {
    String calculator();
    Number plus(Integer num1, Integer num2);
    Number minus(Integer num1, Integer num2);
    Number multiply(Integer num1, Integer num2);
    Number divide(Integer num1, Integer num2);
}
