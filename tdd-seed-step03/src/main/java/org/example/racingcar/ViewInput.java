package org.example.racingcar;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class ViewInput {
    private Scanner scanner;
    private Random random;

    public ViewInput() {
        this.scanner = new Scanner(in);
        this.random = new Random();
    }

    /* 얘는 Viewinput의 역할 */
    public int carCount() throws Exception {
        int numberOfCars = scanner.nextInt();

        if (numberOfCars >= 10) {
            throw new Exception("자동차의 최대 개수를 벗어났습니다.");
        }
        return numberOfCars;
    }

    /* 얘는 Viewinput의 역할 */
    public int carMovingCount() {
        int carMovingCount = scanner.nextInt();

        if (carMovingCount >= 20) {
            throw new RuntimeException("최대 움직임 횟수를 초과했습니다");
        }
        return carMovingCount;
    }
}
