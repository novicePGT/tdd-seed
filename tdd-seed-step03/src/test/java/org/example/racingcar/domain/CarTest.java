package org.example.racingcar.domain;

import org.example.racingcar.strategy.CarMoveStrategy;
import org.example.racingcar.strategy.RandomCarMoveStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("랜덤 전략 반환 테스트")
    void 랜덤_전략_반환_테스트() {
        RandomCarMoveStrategy randomCarMoveStrategy = new RandomCarMoveStrategy();
        int resultData;

        if (randomCarMoveStrategy.testCarMove()) {
            resultData = 1;
        }
        resultData = 0;

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
        Cars cars = new Cars(5);

        Position position = new Position(4);

        Car car = new Car(position);

        IntStream.range(0, cars.getCars().size())
                        .forEach(i -> cars.move(new RandomCarMoveStrategy()));

        assertThat(car.getPosition()).isEqualTo(3);
    }
}