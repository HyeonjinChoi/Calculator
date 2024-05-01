package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 공유 가능하며 하나의 인스턴스로 두 리스트를 관리할 수 있고, 다른 리스트로 바뀌지 않으므로 static, final 제어자 부여 */
    private static final List<Double> arithmeticResult = new ArrayList<>();       // 연산 결과를 저장하는 리스트 선언
    private static final List<Double> circleArea = new ArrayList<>();             // 원의 넓이를 저장하는 리스트 선언

    /**
     *
     * @param firstNum                  // 첫 번째 피연산자
     * @param secondNum                // 두 번째 피연산자
     * @param operator                 // 연산자
     * @return                         // 연산 결과 반환
     * @throws ArithmeticException     // 분모가 0이거나 연산자가 잘못되었다면 예외 발생
     */
    public double calculate(int firstNum, int secondNum, char operator) throws ArithmeticException {
        /* switch를 이용하여 사칙연산 수행 */
        switch (operator) {
            case '+' -> {
                return (double)firstNum + secondNum;
            }
            case '-' -> {
                return (double)firstNum - secondNum;
            }
            case '*' -> {
                return (double)firstNum * secondNum;
            }
            case '/' -> {
                if (secondNum == 0) { throw new ArithmeticException("0으로 나눌 수 없습니다."); }    // 분모가 0일 경우 예외 발생
                return (double)firstNum / secondNum;
            }
            default -> throw new ArithmeticException("사칙연산 기호를 입력하세요.");                   // 잘못된 연산자일 경우 예외 발생
        }
    }

    /**
     *
     * @param radius                // 원의 반지름
     * @return                      // 원의 넓이
     */
    public double calculateCircleArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    /* arithmeticResult의 첫 번째 요소 삭제 */
    public void removeArithmeticResult() {
        arithmeticResult.remove(0);
    }

    /* arithmeticResult의 모든 요소 출력 */
    public void inquiryArithmeticResult() {
        System.out.println(arithmeticResult.toString());
    }

    /* arithmeticResult에 대한 Getter 메서드 */
    public List<Double> getArithmeticResult() {
        return arithmeticResult;
    }

    /* arithmeticResult에 대한 Setter 메서드 */
    public void setArithmeticResult(double result) {
        arithmeticResult.add(result);
    }

    /* circleArea의 첫 번째 요소 삭제 */
    public void removeCircleArea() {
        circleArea.remove(0);
    }

    /* circleArea의 모든 요소 출력 */
    public void inquiryCircleArea() {
        System.out.println(circleArea.toString());
    }

    /* circleArea에 대한 Getter 메서드 */
    public List<Double> getCircleArea() {
        return circleArea;
    }

    /* circleArea에 대한 Setter 메서드 */
    public void setCircleArea(double result) {
        circleArea.add(result);
    }
}
