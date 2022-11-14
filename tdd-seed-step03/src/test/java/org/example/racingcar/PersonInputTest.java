package org.example.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("테스트를 진행하기 위해")
class PersonInputTest {

    private PersonInput personInput;
    private Random random;

    @BeforeEach
    void setup() {
        personInput = new PersonInput();
        random = new Random();
    }

    @DisplayName("자동차의 개수를 입력받는다")
    @Test
    void carCount_Test() {
        /* given */
        int inputData = 3;

        /* when, then */
        assertThat(inputData).isEqualTo(3);

    }

    @DisplayName("자동차의 이름을 색으로 정하기 위해 enum을 사용함")
    @Test
    void carColorName_Test() {
        /* given */
        CarPaint[] colorArray = CarPaint.values();

        /* when */
        List<CarPaint> carColor = Arrays.stream(colorArray).collect(Collectors.toList());

        /* then */
        assertThat(carColor).isEqualTo(carColor);
    }

    @DisplayName("랜덤 숫자 테스트")
    @Test
    void isCarMoving_Test() {
        /* given */
        int movement = random.nextInt(10);

        /* when, then */
        assertThat(movement).isEqualTo("3");

    }
}
// 실패
// 성공
// 리팩토링