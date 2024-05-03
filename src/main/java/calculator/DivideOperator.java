package calculator;

public class DivideOperator implements InterfaceOperation {
    @Override
    public double operate(int firstNum, int secondNum) throws ArithmeticException {
        if (secondNum == 0) { throw new ArithmeticException("0으로 나눌 수 없습니다."); }    // 분모가 0일 경우 예외 발생
        return (double)firstNum / secondNum;
    }
}
