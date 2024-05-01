package calculator;

public class CircleCalculator extends Calculator {
    /**
     *
     * @return                      // 원의 넓이
     */
    @Override
    public double calculate() {
        return Math.pow(radius, 2) * Math.PI;
    }
}