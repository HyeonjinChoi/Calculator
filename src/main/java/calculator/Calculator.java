package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> resultList = new ArrayList<>();       // 연산 결과를 저장하는 리스트

    /**
     *
     * @param firstNum                  // 첫 번째 피연산자
     * @param secondNum                // 두 번째 피연산자
     * @param operator                 // 연산자
     * @return                         // 연산 결과 반환
     * @throws ArithmeticException     // 분모가 0이거나 연산자가 잘못되었다면 예외 발생
     */
    public int calculate(int firstNum, int secondNum, char operator) throws ArithmeticException {
        /* switch를 이용하여 사칙연산 수행 */
        switch (operator) {
            case '+' -> {
                return firstNum + secondNum;
            }
            case '-' -> {
                return firstNum - secondNum;
            }
            case '*' -> {
                return firstNum * secondNum;
            }
            case '/' -> {
                if (secondNum == 0) { throw new ArithmeticException("0으로 나눌 수 없습니다."); }    // 분모가 0일 경우 예외 발생
                return firstNum / secondNum;
            }
            default -> throw new ArithmeticException("사칙연산 기호를 입력하세요.");                   // 잘못된 연산자일 경우 예외 발생
        }
    }

    public void removeResult() {
        this.resultList.remove(0);
    }

    /* resultList에 대한 Getter 메서드 */
    public List<Integer> getResultList() {
        return this.resultList;
    }

    /* resultList에 대한 Setter 메서드 */
    public void setResultList(int result) {
        this.resultList.add(result);
    }
}
