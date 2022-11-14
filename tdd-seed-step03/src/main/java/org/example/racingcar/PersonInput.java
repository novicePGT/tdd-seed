package org.example.racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonInput {
    private Scanner scanner;
    private Random random;

    public PersonInput() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public int carCount(Scanner scanner) {
        int numberOfCars = scanner.nextInt();
        return numberOfCars;
    }

    public List<CarPaint> carToPaintName() {
        CarPaint[] colorArray = CarPaint.values();
        List<CarPaint> carPaintList = Arrays.stream(colorArray).collect(Collectors.toList());

        return carPaintList;
    }

    public void isCarMoving() {
        int movement = random.nextInt(10);

        if (movement >= 4) {
            System.out.println("- ");
        }
    }
}
