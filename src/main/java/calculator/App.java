package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;
        char operator;
        int result = 0;
        String flag;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            operator = sc.next().charAt(0);

            // switch를 활용하여 사칙연산 수행
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
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호를 입력하세요.");
            }

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // exit을 입력 받으면 반복 종료
            flag = sc.next();
            if (flag.equals("exit")) {
                break;
            }
        }
    }
}
