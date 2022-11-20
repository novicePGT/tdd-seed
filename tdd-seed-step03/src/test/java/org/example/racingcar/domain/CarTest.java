package org.example.racingcar.domain;

import org.example.racingcar.strategy.CarMoveStrategy;
import org.example.racingcar.strategy.RandomCarMoveStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자동차 메서드 테스트")
class CarTest {

    @Test
    @DisplayName("자동차 포지션 움직임 테스트")
    void moving_test() {
        Car car = new Car(3);

        int isMovingCar = car.move(new RandomCarMoveStrategy()).getPosition();

        assertThat(isMovingCar).isEqualTo(4);
    }
}