package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class RacingCarView {

    public String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return input.split(",");
    }

    public int getNumberOfAttempts() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    public void printRaceResult(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }
}
