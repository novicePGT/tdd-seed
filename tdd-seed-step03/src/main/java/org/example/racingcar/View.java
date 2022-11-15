package org.example.racingcar;

public class View {

    private PersonInput personInput;

    public View() {
        this.personInput = new PersonInput();
    }

    public void run1() throws Exception {
        int carRounding = 1;
        System.out.print("자동차 대수는 몇 대 (*최대 10대*) 인가요? ");
        int playCar = personInput.carCount();
        System.out.print("이동할 횟수 몇 회 (*최대 20회*) 인가요? ");
        int carMovingCount = personInput.carMovingCount();
        System.out.println("========== 실행 결과 ==========");

        while (carRounding <= playCar) {
            System.out.print(personInput.carToPaintName(carRounding-1) + ": ");
            personInput.isCarMoving(carMovingCount);
            System.out.println();
            carRounding++;
        }
    }
}
