package org.example.racingcar;

enum CarPaint {
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5),
    INDIGO(6), VIOLET(7), PINK(8), WHITE(9), BLACK(10);

    private final int value;

    CarPaint(int value) {
        this.value = value;
    }
}
