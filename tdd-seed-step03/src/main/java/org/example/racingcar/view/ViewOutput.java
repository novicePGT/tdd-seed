package org.example.racingcar.view;

import org.example.racingcar.domain.Car;
import org.example.racingcar.domain.Cars;
import org.example.racingcar.strategy.RandomCarMoveStrategy;

import java.util.stream.IntStream;

public class ViewOutput {

    public static void printResult(Cars cars, int round) {
        // 라운드 만큼 cars move
        Car car = new Car(0);

        IntStream.range(0, cars.getCars().size())
                .forEach( printCarMove -> {
                    int roundCount = 0;
                    while (round >= roundCount) {
                        cars.move(new RandomCarMoveStrategy());
                        roundCount++;
                    }
                    System.out.println("-".repeat(car.getPosition()));
                });
    }
}
