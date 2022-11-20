package org.example.racingcar.domain;

import org.example.racingcar.strategy.CarMoveStrategy;

import java.util.Objects;

public class Car {

    private Position position;
    private int GENERATE_MIN_POSITION = 0;

    /* 포지션의 위치를 부생성자 오버로딩을 통해 가져옴 */
    public Car(int position) {
        this(new Position(position));
    }

    /* 주생성자 */
    public Car(Position position) {
        validatePosition(position);
        this.position = position;
    }

    private void validatePosition(Position position) {
        if (Objects.isNull(position)) {
            throw new RuntimeException("[NULL POSITION EXCEPTION]");
        }
        if (position.getPosition() <= GENERATE_MIN_POSITION) {
            throw new RuntimeException("[NEGATIVE POSITION EXCEPTION]");
        }
    }

    /* 랜덤한 이벤트를 단위 테스트하기 위해 디자인 전략 패턴을 활용 */
    public Car move(CarMoveStrategy carMoveStrategy) {
        if (carMoveStrategy.testCarMove()) {
            return new Car(position.increase());
        }
        return this;
    }

    public int getPosition() {
        return position.getPosition();
    }
}
