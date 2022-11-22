package org.example.racingcar.domain;

import org.example.racingcar.strategy.CarMoveStrategy;
import org.example.racingcar.strategy.RandomCarMoveStrategy;
import org.example.racingcar.view.ViewInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자동차 메서드 테스트")
class CarTest {

    @Test
    @DisplayName("자동차 기본 포지션 테스트")
    void 처음_포지션_테스트() {
        Position position = new Position(0);
        assertThat(position.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("랜덤 숫자 테스트")
    void 랜덤_숫자_테스트() {
        int data = 0;
        if (new Random().nextInt(10) >= 4) {
            data = 1;
        }
        assertThat(data).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤 전략 반환 테스트")
    void 랜덤_전략_반환_테스트() {
        RandomCarMoveStrategy randomCarMoveStrategy = new RandomCarMoveStrategy();
        int resultData = 0;

        if (randomCarMoveStrategy.testCarMove()) {
            resultData = 1;
        }
        assertThat(resultData).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 포지션 움직임 테스트")
    void moving_test() {
        Car car = new Car(3);

        int isMovingCar = car.move(new RandomCarMoveStrategy()).getPosition();

        assertThat(isMovingCar).isEqualTo(4);
    }

    @Test
    @DisplayName("자동차가 총 움직인 횟수 테스트")
    void 움직인_횟수_테스트() {
        /*
        라운드 만큼 cars.move(new RandomCarMoveStrategy) 하면 car에서 트루면 포지션 값을 증가시킬 것임.
        그것을 차의 개수만큼 반복시키는 IntStream()으로 다시 반복하면 차의 개수만큼 각자 포지션 값 만큼 "-"를 찍을 수 있을 것임. 라는 의견
        */
        Cars cars = new Cars(5);
        Car car = new Car(1);
        Position position = new Position(car.getPosition());

        IntStream.range(0, cars.getCars().size())
                .forEach( carCount -> {
                    IntStream.range(0, 3)
                            .forEach( round -> car.move(new RandomCarMoveStrategy()));
                    cars.getCarsPosition();
                });
    }
}