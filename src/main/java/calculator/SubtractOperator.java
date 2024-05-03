package calculator;

public class SubtractOperator implements InterfaceOperation {
    @Override
    public double operate(int firstNum, int secondNum) { return (double)firstNum - secondNum; }
}
