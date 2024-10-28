# java-racingcar-precourse

## 구현할 기능 목록 정리

- Model:
    - Car 클래스의 Car() 메소드로 각 차수별로 각 자동차마다 무작위 값(0~9)을  생성한다.
    - move() 메소드로 4 이상일 경우 전진하는 메소드를 작성한다.

- View:
    - RacingCarView 클래스의 getCarNames() 메소드와 getNumberOfAttempts() 메소드에서, 사용자로부터 값(경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)과 시도할 횟수)을 입력받는다.
    - printTaceResult() 메소드를 통해, 각 차수별 실행 결과(각 자동차별로 이동한 경우 '-'를 추가한다.)를 보여준다.
    - printWinners() 메소드를 통해, 최종 우승자를 표출한다.

- Controller:
    - RacingCarController 클래스가 Model과 View를 연결하고 전체 로직을 제어한다.