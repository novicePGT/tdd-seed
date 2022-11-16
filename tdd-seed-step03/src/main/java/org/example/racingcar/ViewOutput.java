package org.example.racingcar;

public class ViewOutput {

    private ViewInput viewInput;
    private Name name;
    private Car car;

    public ViewOutput() {
        this.viewInput = new ViewInput();
        this.name = new Name();
        this.car = new Car();
    }

    public void runRacingGame() throws Exception {
        int carRounding = 1;
        System.out.print("자동차 대수는 몇 대 (*최대 10대*) 인가요? ");
        int playCar = viewInput.carCount();
        System.out.print("이동할 횟수 몇 회 (*최대 20회*) 인가요? ");
        int carMovingCount = viewInput.carMovingCount();
        System.out.println("========== 실행 결과 ==========");

        while (carRounding <= playCar) {
            System.out.print(name.getCarName(carRounding-1) + ": ");
            car.isCarMoving(carMovingCount);
            System.out.println();
            carRounding++;
        }
    }
}
