package org.example.racingcar.view;
import org.example.racingcar.domain.Cars;
import org.example.racingcar.domain.Round;
import org.example.racingcar.strategy.RandomCarMoveStrategy;

import static java.lang.System.out;

public class ViewOutput {

    public static void printResult(Cars cars, Round round) {
        for (int i = 0; i < round.getRound(); i++) {
            cars = cars.move(new RandomCarMoveStrategy());
        }
        cars.getCars()
                .stream()
                .forEach( car -> out.println("-".repeat(car.getPosition())));
    }
}
