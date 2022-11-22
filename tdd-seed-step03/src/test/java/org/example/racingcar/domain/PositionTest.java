package org.example.racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("포지션 메서드 테스트")
class PositionTest {

    @Test
    @DisplayName("포지션 값 증가 테스트")
    void increase_test() {
        /* given */
        Position position = new Position(3);
        /* when */
        int nextPosition = position.increase().getPosition();
        /* then */
        assertThat(nextPosition).isEqualTo(4);
    }
}