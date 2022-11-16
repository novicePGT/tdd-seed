package org.example.racingcar;

enum CarNameType {
    k3(1), k5(2), k7(3), k9(4), avante(5),
    sonata(6), grandeur(7), genesis(8), benz(9), bmw(10);

    private final int value;

    CarNameType(int value) {
        this.value = value;
    }
}
