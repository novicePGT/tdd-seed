package org.example.stringCalculator;

import java.util.Scanner;

public class CalculatorView {
    private CalculatorService service;

    public CalculatorView() {
        this.service = new CalculatorService(new Scanner(System.in));
    }

    public void viewOfRun() {
        System.out.println("===============문자열 계산기===============");
        System.out.println();
        System.out.println("문자열 연산을 하기위한 값을 / x + y / 형식으로 입력해주세요. * 종료 = 0 * ");

        service.run();
    }
}
