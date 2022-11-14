package org.example.racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonInput {
    private Scanner scanner;

    public PersonInput() {
        this.scanner = new Scanner(System.in);
    }

    public int carCount(Scanner scanner) {
        int numberOfCars = scanner.nextInt();
        return numberOfCars;
    }

    public List<CarPaint> carToPaintName(int inputCarCount) {
        CarPaint[] colorArray = CarPaint.values();
        List<CarPaint> carPaintList = Arrays.stream(colorArray).collect(Collectors.toList());

        return carPaintList;
    }
}
