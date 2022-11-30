package org.example.racingcar.domain;

import org.example.racingcar.view.ViewInput;

import java.util.Arrays;

public class CarName {

    private String carNameBySystem;
    private String[] carNames;

    public CarName(String carNameBySystem, int carCount) {
        this.carNameBySystem = carNameBySystem;
        this.carNames = new String[carCount];
    }

    public String[] getCarNames() {
        carNames = Arrays.stream(carNameBySystem.split(","))
                .map(String::trim)
                .toArray(String[]::new);

        return carNames;
    }
}
