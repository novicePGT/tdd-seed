package org.example;

import org.example.racingcar.domain.*;
import org.example.racingcar.view.ViewInput;
import org.example.racingcar.view.ViewOutput;

public class RacingCarGame {
    public static void main(String[] args) {
        CarCount carCount = new CarCount(ViewInput.getCarCountBySystem());

        Round round = new Round(ViewInput.getCarMovingCountBySystem());

        Cars cars = new Cars(carCount.getCount());

        Car car = new Car(0);

        ViewOutput.printResult(cars, round.getRound());
    }
}