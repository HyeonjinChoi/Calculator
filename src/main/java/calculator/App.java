package calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());     // 사칙연산 클래스로 인스턴스 생성
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());                 // 원의 넓이 클래스로 인스턴스 생성

        while (true) {
            /* 사칙연산과 원의 넓이를 구하는 것 중 선택 */
            System.out.print("사칙연산을 진행할지 원의 넓이를 구할지 고르세요. (1 : 사칙연산 / 2 : 원의 넓이) : ");
            Integer input = sc.nextInt();

            if (input == 1) {                                     // 사칙연산 진행
                System.out.print("첫 번째 숫자를 입력하세요: ");
                /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
                int firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
                int secondNum = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                /* 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장 */
                char operator = sc.next().charAt(0);
                /* arithmeticResult에 연산 결과 저장 */
                try {
                    arithmeticCalculator.setResultList(arithmeticCalculator.calculate(firstNum, secondNum, operator));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if (input == 2) {                              // 원의 넓이 구하기 진행
                System.out.print("원의 반지름을 입력하세요: ");
                /* Scanner를 사용하여 Double형 반지름을 입력받음 */
                double radius = sc.nextDouble();
                /* circleArea 연산 결과 저장 */
                circleCalculator.setResultList(circleCalculator.calculate(radius));
            } else {                                               // 잘못된 입력
                System.out.println("정확히 입력하세요.");
                continue;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* remove를 입력 받으면 리스트의 첫 번째 요소 삭제 */
            if (Objects.equals(sc.next(), "remove")) {
                /* 사칙연산 결과 또는 원의 넓이 삭제 */
                if (input == 1) { arithmeticCalculator.removeList(); }
                else { circleCalculator.removeList(); }
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* inquiry를 입력 받으면 리스트의 모든 요소 출력 */
            if (Objects.equals(sc.next(), "inquiry")) {
                /* 사칙연산 결과 또는 원의 넓이 출력 */
                if (input == 1) { arithmeticCalculator.inquiryList(); }
                else { circleCalculator.inquiryList(); }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if (Objects.equals(sc.next(), "exit")) { break; }
        }
    }
}