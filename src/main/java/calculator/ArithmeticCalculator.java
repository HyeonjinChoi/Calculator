package calculator;

public class ArithmeticCalculator extends Calculator {
    /**
     *
     * @return                         // 연산 결과 반환
     * @throws ArithmeticException     // 분모가 0이거나 연산자가 잘못되었다면 예외 발생
     */
    @Override
    public double calculate() throws ArithmeticException {
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
}