package org.example.racingcar.domain;

import org.example.racingcar.strategy.CarMoveStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class Cars {
    private final List<Car> cars;

    /* 부생성자로 입력된 차의 개수를 리스트화 시킴 */
    public Cars(int carCount) {
        this(IntStream.range(0, carCount)
                .mapToObj(it -> new Car(0))
                .collect(Collectors.toList()));
    }

    /* 주생성자로 cars를 초기화함 */
    public Cars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public void move(CarMoveStrategy carMoveStrategy) {
        cars.stream()
                .forEach(car -> car.move(carMoveStrategy));
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public void getCarsPosition() {
        cars.stream()
                .peek( i -> out.println(i));
    }
}