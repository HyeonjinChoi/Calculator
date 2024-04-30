package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;                        // 피연산자
        char operator;                                 // 연산자
        int result = 0;                                // 연산 결과
        String signal;                                 // 삭제 및 종료 여부
        List<Integer> numList = new ArrayList<>();     // 연산 결과 저장할 리스트

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
            firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            /* Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장 */
            secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            /* 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장 */
            operator = sc.next().charAt(0);

            /* switch를 활용하여 사칙연산 수행 */
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호를 입력하세요.");
            }

            System.out.println("결과: " + result);
            /* 연산 결과 리스트에 저장 */
            numList.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* remove를 입력 받으면 리스트의 첫번째 요소 삭제 */
            signal = sc.next();
            if (signal.equals("remove")) { numList.remove(0); }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* inquiry를 입력 받으면 리스트의 모든 요소 출력 */
            signal = sc.next();
            if (signal.equals("inquiry")) {
                for (int num : numList) { System.out.print(num + " "); }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            signal = sc.next();
            if (signal.equals("exit")) { break; }
        }
    }
}
