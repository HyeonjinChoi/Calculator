package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;         // 피연산자
        char operator;                  // 연산자
        int result = 0;                 // 연산 결과
        String flag;                     // 종료 여부
        int[] numArr = new int[10];     // 연산 결과 저장할 배열
        int index = 0;                  // 연산 결과 카운트

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
            /*
             * 연산 결과 배열에 저장
             * 열산 결과의 개수가 10개를 초과할 경우, index가 하나씩 당겨짐
             * 가장 먼저 저장된 결과는 삭제, 가장 마지막에 저장된 결과는 index: 9
             */
            if (index > 9) {
                for (int i = 1; i < 10; i++) {
                    numArr[i - 1] = numArr[i];
                }
                numArr[9] = result;
            } else {
                numArr[index++] = result;
            }

            for (int i : numArr) {
                System.out.print(i + " ");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            flag = sc.next();
            if (flag.equals("exit")) {
                break;
            }
        }
    }
}
