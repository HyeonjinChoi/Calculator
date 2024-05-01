package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    /* 공유 가능하며 하나의 인스턴스로 두 리스트를 관리할 수 있고, 다른 리스트로 바뀌지 않으므로 static, final 제어자 부여 */
    private static final List<Double> arithmeticResult = new ArrayList<>();       // 연산 결과를 저장하는 리스트 선언
    private static final List<Double> circleArea = new ArrayList<>();             // 원의 넓이를 저장하는 리스트 선언
    /* 공유 가능하므로 메모리 절약을 위해 static 제어자 부여 */
    static int firstNum, secondNum;
    static char operator;
    static double radius;
    public abstract double calculate();

    /* arithmeticResult에 대한 Getter 메서드 */
    public List<Double> getArithmeticResult() {
        return arithmeticResult;
    }

    /* arithmeticResult에 대한 Setter 메서드 */
    public void setArithmeticResult(double result) {
        arithmeticResult.add(result);
    }

    /* circleArea에 대한 Getter 메서드 */
    public List<Double> getCircleArea() {
        return circleArea;
    }

    /* circleArea에 대한 Setter 메서드 */
    public void setCircleArea(double result) {
        circleArea.add(result);
    }

    /* List의 첫 번째 요소 삭제 */
    public void removeList(List list) {
        list.remove(0);
    }

    /* List의 모든 요소 출력 */
    public void inquiryList(List list) {
        System.out.println(list.toString());
    }
}