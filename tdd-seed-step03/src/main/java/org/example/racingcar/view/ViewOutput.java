package org.example.racingcar.view;
import org.example.racingcar.domain.*;
import org.example.racingcar.strategy.RandomCarMoveStrategy;

import static java.lang.System.out;

public class ViewOutput {

    private static int CYCLE_VALUE = 0;

    public static void printResult(Cars cars, Round round, CarName carName) {

        String[] carNames = carName.getCarNames();

        for (int i = 0; i < round.getRound(); i++) {
            cars = cars.move(new RandomCarMoveStrategy());
        }
        cars.getCars()
                .forEach(car -> {
                    printCycle(carNames, car);
                });
        out.println(WinnerCar.getWinnerCar().getKey());
    }

    private static void printCycle(String[] carNames, Car car) {
        out.print(carNames[CYCLE_VALUE] + ": ");
        out.println("-".repeat(car.getPosition()));
        WinnerCar.runnerCar(carNames[CYCLE_VALUE], car.getPosition());
        CYCLE_VALUE++;
    }
}
