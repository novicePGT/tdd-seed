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
    public static int getCarMovingCountBySystem() {
        System.out.print("시도할 회수는 몇 회 인가요? ");
        return scanner.nextInt();
    }

    public static String getCarNameBySystem() {
        scanner.nextLine(); //nextInt() 에서 Enter 를 칠 때 발생하는 '개행문자'를 처리하지 않고 버퍼에 남기기 때문에 추가.
        System.out.print("자동차의 이름은 무엇인가요? ");
        return scanner.nextLine();
    }
}
