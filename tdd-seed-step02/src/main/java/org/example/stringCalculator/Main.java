package org.example.stringCalculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CalculatorService calculatorService = new CalculatorService(scanner);
        calculatorService.run();
    }
}
