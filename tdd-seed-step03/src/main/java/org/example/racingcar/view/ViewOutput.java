package org.example.racingcar.view;
import org.example.racingcar.domain.Car;
import org.example.racingcar.domain.CarName;
import org.example.racingcar.domain.Cars;
import org.example.racingcar.domain.Round;
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
    }

    private static void printCycle(String[] carNames, Car car) {
        out.print(carNames[CYCLE_VALUE] + ": ");
        out.println("-".repeat(car.getPosition()));
        CYCLE_VALUE++;
    }
}
