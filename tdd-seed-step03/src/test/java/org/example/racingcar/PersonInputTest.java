package org.example.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("테스트를 진행하기 위해")
class PersonInputTest {

    private PersonInput personInput;

    @BeforeEach
    void setup() {
        personInput = new PersonInput(new Scanner(System.in));
    }

    @DisplayName("자동차의 개수를 입력받는다")
    @Test
    void carCount_Test() {
        /* given */
        int inputData = 3;

        /* when, then */
        assertThat(inputData).isEqualTo(3);

    }
}
// 실패
// 성공
// 리팩토링