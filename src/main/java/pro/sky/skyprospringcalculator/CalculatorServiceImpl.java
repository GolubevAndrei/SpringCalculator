package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) return "Одно из полей не передано";
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) return "Одно из полей не передано";
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) return "Одно из полей не передано";
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) return "Одно из полей не передано";
        if (num2 == 0) throw new IllegalArgumentException("Неверное значение второго аргумента");
        double divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }
}
