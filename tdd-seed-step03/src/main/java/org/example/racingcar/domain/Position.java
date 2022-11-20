package org.example.racingcar.domain;


public class Position {

    private int position;

    public Position(int position) {
        this.position = position;
    }

    /* 부생성자의 개념 */
    public Position increase() {
        return new Position(position + 1);
    }

    /* 우승자를 찾기 위한 메서드 */
    public int getPosition() {
        return position;
    }
}
