package org.example.racingcar.domain;

public class Round {
    private static final int GENERATE_MIN_ROUND = 0;

    private final int round;

    public Round(final int round) {
        validateRound(round);
        this.round = round;
    }

    private void validateRound(int count) {
        if(count <= GENERATE_MIN_ROUND) {
            throw new RuntimeException("[MIN_ROUND EXCEPTION]");
        }
    }
}
