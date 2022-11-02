package org.example.stringCalculator.stringCalculator;

import org.example.stringCalculator.CalculatorController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CalculatorServiceTest {

    private CalculatorController calculatorController;

    @BeforeEach
    void setUp() {
        calculatorController = new CalculatorController();
    }

    @Test
    @DisplayName("run 메서드의 에러처리 테스트는")
    void runTest() {
        //given
        String data = "";
        String testData = Optional.ofNullable(data).orElse(" ");

        //when, then
        assertThatThrownBy(() -> assertThat(testData).isEqualTo(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("null이거나 빈 공백 문자입니다.");
    }
}