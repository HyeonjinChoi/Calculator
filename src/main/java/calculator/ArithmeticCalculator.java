package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    InterfaceOperation operation;       // 사칙연산 분리를 위한 인터페이스

    /* 생성자 선언 */
    public ArithmeticCalculator(List<Double> resultList) {
        super(resultList);              // 부모 클래스 생성자 호출
    }

    /**
     * @param firstNum                           // 첫 번째 피연산자
     * @param secondNum                         // 두 번째 피연산자
     * @param operator                          // 연산자
     * @return                                  // 연산 결과 반환
     * @throws ArithmeticException              // 0으로 나누는 예외 발생
     * @throws UnsupportedOperationException    // 잘못된 연산자 예외 발생
     */
    public double calculate(int firstNum, int secondNum, char operator) throws ArithmeticException, UnsupportedOperationException {
        /* switch를 이용하여 사칙연산 수행 */
        switch (operator) {
            case '+' -> {
                operation = new AddOperator();          // AddOperator로 타입 변환
                return operation.operate(firstNum, secondNum);
            }
            case '-' -> {
                operation = new SubtractOperator();    // SubtractOperator로 타입 변환
                return operation.operate(firstNum, secondNum);
            }
            case '*' -> {
                operation = new MultiplyOperator();     // MultiplyOperator로 타입 변환
                return operation.operate(firstNum, secondNum);
            }
            case '/' -> {
                operation = new DivideOperator();       // DivideOperator로 타입 변환
                return operation.operate(firstNum, secondNum);
            }
            case '%' -> {
                operation = new ModOperator();          // ModOperator로 타입 변환
                return operation.operate(firstNum, secondNum);
            }
            default -> throw new UnsupportedOperationException("사칙연산 기호를 입력하세요.");    // 잘못된 연산자일 경우 예외 발생
        }
    }

    /* arithmeticResult의 첫 번째 요소 삭제 */
    @Override
    public void removeList() {
        super.getResultList().remove(0);
    }

    /* arithmeticResult의 모든 요소 출력 */
    @Override
    public void inquiryList() {
        System.out.println(super.getResultList().toString());
    }
}