package org.example.racingcar.view;

import java.util.Scanner;

import static java.lang.System.*;

public class ViewInput {
    private static Scanner scanner = new Scanner(in);

    /* 얘는 Viewinput의 역할 */
    public static int getCarCountBySystem() {
        System.out.print("자동차 대수는 몇 대 인가요? ");
        return scanner.nextInt();
    }

    /* 얘는 Viewinput의 역할 */
    public static int carMovingCount() {
        System.out.print("시도할 회수는 몇 회 인가요? ");
        return scanner.nextInt();
    }
}
