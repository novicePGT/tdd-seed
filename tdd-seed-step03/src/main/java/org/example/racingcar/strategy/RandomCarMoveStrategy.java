package org.example.racingcar.strategy;

import java.util.Random;

public class RandomCarMoveStrategy implements CarMoveStrategy{
    @Override
    public boolean testCarMove() {
        return new Random().nextInt(10) >= 4;
    }
}
