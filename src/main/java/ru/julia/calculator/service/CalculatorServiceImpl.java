package ru.julia.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    // 1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
//2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
// 3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
// 4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
// 5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + Integer.toString(num1 / num2);
    }
}
