package org.example.stringCalculator;

import java.util.Optional;
import java.util.Scanner;

public class CalculatorService {
    private Scanner scanner; // 스캐너로 입력 받은 값
    private CalculatorController calculate;

    public CalculatorService(Scanner scanner) {
        this.scanner = scanner;
        this.calculate = new CalculatorController();
    }

    public void run() throws IllegalArgumentException {
        String inputArithmeticData = "";
        boolean flag = true;
        System.out.println("===============문자열 계산기===============");
        System.out.println();

        do {
            System.out.println("문자열 연산을 하기위한 값을 / x + y / 형식으로 입력해주세요. * 종료 = 0 * ");
            System.out.print("입력 : ");
            inputArithmeticData = scanner.nextLine();

            String target = Optional.ofNullable(inputArithmeticData).orElse("");
            if (target.isBlank()) {
                throw new IllegalArgumentException();
            }
            int result = calculate.StringOfCalculate(inputArithmeticData);

            if (result == -1) {
                System.out.println("올바른 형식으로 입력해주세요.");
            }
            if (result != -1) {
                System.out.println("결과 값은 : " + result);
            }
            if (result == 0) {
                flag = false;
            }
        } while (flag);
    }
}
