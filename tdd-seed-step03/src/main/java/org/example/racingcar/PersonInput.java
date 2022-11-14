package org.example.racingcar;

import java.util.Scanner;

public class PersonInput {
    private Scanner scanner;

    public PersonInput() {
        this.scanner = new Scanner(System.in);
    }

    public int carCount(Scanner scanner) {
        int numberOfCars = scanner.nextInt();
        return numberOfCars;
    }


}
