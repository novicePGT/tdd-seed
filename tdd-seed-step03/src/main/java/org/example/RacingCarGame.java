package org.example;

import org.example.racingcar.domain.*;
import org.example.racingcar.view.ViewInput;
import org.example.racingcar.view.ViewOutput;

public class RacingCarGame {
    public static void main(String[] args) {
        CarCount carCount = new CarCount(ViewInput.getCarCountBySystem());

        Round round = new Round(ViewInput.getCarMovingCountBySystem());

        CarName carName = new CarName(ViewInput.getCarNameBySystem(), carCount.getCount());

        Cars cars = new Cars(carCount.getCount());

        ViewOutput.printResult(cars, round, carName);
    }
}