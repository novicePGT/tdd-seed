package org.example.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.System.*;

public class PersonInput {
    private Scanner scanner;
    private Random random;

    public PersonInput() {
        this.scanner = new Scanner(in);
        this.random = new Random();
    }

    public int carCount() throws Exception {
        int numberOfCars = scanner.nextInt();

        if (numberOfCars >= 10) {
            throw new Exception("자동차의 최대 개수를 벗어났습니다.");
        }
        return numberOfCars;
    }

    public CarPaint carToPaintName(int index) {
        CarPaint[] colorArray = CarPaint.values();

        /* 자동차의 최대 개수를 정해두었기 때문에 범위를 벗어날 일이 없음*/
        return colorArray[index];
    }

    public int carMovingCount() {
        int carMovingCount = scanner.nextInt();

        if (carMovingCount >= 20) {
            throw new RuntimeException("최대 움직임 횟수를 초과했습니다");
        }
        return carMovingCount;
    }

    public void isCarMoving(int carMovingCount) {
        int carMovingRounding = 0;
        ArrayList<String> valueList = new ArrayList<>();
        while (carMovingRounding < carMovingCount){
            validateList(valueList);
            carMovingRounding++;
        }
        Stream<String> valueStream = valueList.stream();
        valueStream.forEach(out::print);
    }

    private void validateList(ArrayList<String> valueList) {
        if (random.nextInt(10) >= 4) {
            valueList.add("-");
        }
    }
}
