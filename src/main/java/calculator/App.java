package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();      // Calculator 인스턴스 생성

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
            int secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            /* 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장 */
            char operator = sc.next().charAt(0);

            /* Calculator 클래스의 리스트 필드에 연산 결과 저장 */
            try {
                calculator.setResultList(calculator.calculate(firstNum, secondNum, operator));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* remove를 입력 받으면 리스트의 첫번째 요소 삭제 */
            if (sc.next().equals("remove")) { calculator.removeResult(); }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* inquiry를 입력 받으면 리스트의 모든 요소 출력 */
            if (sc.next().equals("inquiry")) { calculator.inquiryResults(); }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if (sc.next().equals("exit")) { break; }
        }
    }
}
