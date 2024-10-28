package racingcar;

public class RacingCarController {
    private RacingCarView view;
    private Car[] cars;

    public RacingCarController() {
        this.view = new RacingCarView();
    }

    public void startRace() {
        String[] carNames = view.getCarNames();
        int attempts = view.getNumberOfAttempts();
        initializeCars(carNames);

        for (int i = 0; i < attempts; i++) {
            raceOnce();
            view.printRaceResult(cars);
        }

        String winners = determineWinners();
        view.printWinners(winners);
    }

    private void initializeCars(String[] carNames) {
        cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
    }

    private void raceOnce() {
        for (Car car : cars) {
            car.move();
        }
    }

    private String determineWinners() {
        int maxPosition = findMaxPosition();
        return buildWinnersString(maxPosition);
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    private String buildWinnersString(int maxPosition) {
        StringBuilder winners = new StringBuilder();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                if (winners.length() > 0) {
                    winners.append(", ");
                }
                winners.append(car.getName());
            }
        }
        return winners.toString();
    }
}
