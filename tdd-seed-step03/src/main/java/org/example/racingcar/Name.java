package org.example.racingcar;

public class Name {
    public CarNameType getCarName (int index) {
        CarNameType[] carNames = CarNameType.values();

        return carNames[index];
    }
}
