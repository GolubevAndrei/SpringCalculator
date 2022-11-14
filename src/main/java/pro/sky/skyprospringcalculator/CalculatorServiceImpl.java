package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcalculator.Exeption.DevideByZeroExeption;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public Number plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) throw new DevideByZeroExeption("Одно из полей не передано");
        return num1 + num2;

    }

    public Number minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) throw new DevideByZeroExeption("Одно из полей не передано");
        return num1 - num2;

    }

    public Number multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) throw new DevideByZeroExeption("Одно из полей не передано");
        return num1 * num2;

    }

    public Number divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){ throw new DevideByZeroExeption("Одно из полей не передано");}
        if (num2 == 0) {throw new DevideByZeroExeption("Делить на ноль нельзя");}
        return num1.doubleValue() / num2;
    }
}
