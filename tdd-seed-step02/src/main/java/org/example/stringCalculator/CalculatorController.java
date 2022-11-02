package org.example.stringCalculator;

public class CalculatorController {
    // 연산을 위한 메서드
    public int arithmetic(int firstNumber, char operatorSymbol, int secondNumber) {
        if (operatorSymbol == '+') {
            return add(firstNumber, secondNumber);
        }
        if (operatorSymbol == '-') {
            return sub(firstNumber, secondNumber);
        }
        if (operatorSymbol == '/') {
            return div(firstNumber, secondNumber);
        }
        if (operatorSymbol == '*') {
            return mul(firstNumber, secondNumber);
        }
        return 0;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int StringOfCalculate(String str) {
        if (str.equals("0")) {
            return 0;
        }
        if (!str.contains(" ")) {
            return -1;
        }
        String[] value = str.split(" "); // 1 + 2면 value[0]에 1 value[1] + ...
        int result = Integer.parseInt(value[0]);
        for (int i=0; i < value.length -2; i=i+2) {
            result = this.arithmetic(result,
                    value[i+1].charAt(0), Integer.parseInt(value[i+2]));
        } return result;
    }
}
