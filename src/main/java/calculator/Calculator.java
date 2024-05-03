package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    /* 공유는 불가능하고, 다른 리스트로 바뀌지 않으므로 final 제어자만 부여 */
    private final List<Double> resultList;       // 연산 결과를 저장하는 리스트 선언

    /* 생성자 선언 */
    public Calculator(List<Double> resultList) { this.resultList = resultList; }

    /* resultList에 대한 Getter 메서드 */
    public List<Double> getResultList() {
        return resultList;
    }

    /* resultList에 대한 Setter 메서드 */
    public void setResultList(double result) {
        resultList.add(result);
    }

    /* List의 첫 번째 요소 삭제 */
    public abstract void removeList();

    /* List의 모든 요소 출력 */
    public abstract void inquiryList();
}