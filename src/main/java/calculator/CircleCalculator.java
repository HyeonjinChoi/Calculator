package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {
    /* 생성자 선언 */
    public CircleCalculator(List<Double> resultList) {
        super(resultList);              // 부모 클래스 생성자 호출
    }

    /**
     * @param radius               // 원의 반지름
     * @return                     // 원의 넓이 반환
     */
    public double calculate(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    /* circleArea의 첫 번째 요소 삭제 */
    @Override
    public void removeList() {
        super.getResultList().remove(0);
    }

    /* circleArea의 모든 요소 출력 */
    @Override
    public void inquiryList() {
        System.out.println(super.getResultList().toString());
    }
}