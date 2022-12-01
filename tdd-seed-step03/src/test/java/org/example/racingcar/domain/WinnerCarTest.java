package org.example.racingcar.domain;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("우승자 클래스")
class WinnerCarTest {

    private Map<String, Integer> map;
    private String[] carNames = new String[] {"car1", "car2", "car3"};

    @BeforeEach
    void setMap() {
        map = new HashMap<>();
        map.put(carNames[0], 2);
        map.put(carNames[1], 4);
        map.put(carNames[2], 6);
    }

    @Test
    @DisplayName("Map 컬렉션 반환 테스트")
    void map_반환테스트() {
        //then
        assertThat(map.size()).isEqualTo(3);
        assertThat(map.get("car1")).isEqualTo(2);
    }

    @Test
    @DisplayName("우승자 반환 테스트")
    void 우승자_반환테스트() {
        // given
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        };

        //when
        Map.Entry<String, Integer> winner = Collections.max(map.entrySet(), comparator);

        //then
        assertThat(winner.getKey()).isEqualTo("car3");
    }
}