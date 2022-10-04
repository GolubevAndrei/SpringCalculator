package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2) {
        try {
            return calculatorService.divide(num1, num2);
        } catch (Throwable n) {
            return n.getMessage();
        }

    }

}
