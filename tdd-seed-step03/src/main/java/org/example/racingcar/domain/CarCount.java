package org.example.racingcar.domain;

public class CarCount {

    private final int GENERATE_MIN_COUNT = 0;
    private int count;

    public CarCount(int carCount) {
        validateCarCount(carCount);
        this.count = carCount;
    }

    private void validateCarCount(int carCount) {
        if (carCount <= GENERATE_MIN_COUNT) {
            throw new RuntimeException("[MIN_COUNT EXCEPTION]");
        }
    }
}
