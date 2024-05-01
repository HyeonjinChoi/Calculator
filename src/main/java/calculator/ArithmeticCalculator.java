package calculator;

public class ArithmeticCalculator extends Calculator {
    AbstractOperation operation;       // 사칙연산 분리를 위한 추상클래스

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
                operation = new AddOperator();          // AddOperator로 타입 변환
                return operation.operate(firstNum, secondNum, operator);
            }
            case '-' -> {
                operation = new SubtractOperator();     // SubtractOperator로 타입 변환
                return operation.operate(firstNum, secondNum, operator);
            }
            case '*' -> {
                operation = new MultiplyOperator();     // MultiplyOperator로 타입 변환
                return operation.operate(firstNum, secondNum, operator);
            }
            case '/' -> {
                operation = new DivideOperator();       // DivideOperator로 타입 변환
                return operation.operate(firstNum, secondNum, operator);
            }
            default -> throw new ArithmeticException("사칙연산 기호를 입력하세요.");    // 잘못된 연산자일 경우 예외 발생
        }
    }
}