package org.example.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Car {

    int MIN_MOVING_ROUNDING = 0;

    private Random random;

    public Car() {
        this.random = new Random();
    }

    public void isCarMoving(int carMovingCount) {
        int movingRounding = MIN_MOVING_ROUNDING;
        ArrayList<String> valueList = new ArrayList<>();
        while (movingRounding < carMovingCount){
            validateList(valueList);
            movingRounding++;
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
