package org.example.racingcar.domain;

import java.util.*;

public class WinnerCar {

    // map 을 하나씩만 생성하기 위해서 static 사용
    private static Map<String, Integer> runner = new HashMap<>();

    public static void runnerCar(String carName, int carPosition) {
        runner.put(carName, carPosition);
    }

    public static Map.Entry<String, Integer> getWinnerCar() {
        Comparator<Map.Entry<String, Integer>> comparatorCar = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        };
        Map.Entry<String, Integer> winnerCar = Collections.max(runner.entrySet(), comparatorCar);
        return winnerCar;
    }
}
