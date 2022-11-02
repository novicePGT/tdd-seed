package org.example.stringCalculator.stringCalculator;

import org.example.stringCalculator.CalculatorController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("CalculatorMethodTest 클래스")
class CalculatorControllerTest {

    private CalculatorController calculatorController;

    @BeforeEach
    void setup() {
        calculatorController = new CalculatorController();
    }

    @Test
    @DisplayName("연산 테스트")
    void arithmeticTest() {
        //given
        String inputData = "1 + 2 / 3 * 4 - 5";

        //when
        int currentData = calculatorController.StringOfCalculate(inputData);

        //then
        assertThat(currentData).isEqualTo(-1);
    }
}