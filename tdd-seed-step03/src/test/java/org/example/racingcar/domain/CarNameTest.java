package org.example.racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자동차 이름을 반환하는 클래스 테스트")
class CarNameTest {

    @Test
    @DisplayName(",으로 문자열 가르기 테스트")
    void split_메서드_테스트() {
        //given
        String names = "car1, car2, car3";

        //when
        String[] name = names.split(",");

        //then
        assertThat(name).contains("car1","car2", "car3");
    }
}