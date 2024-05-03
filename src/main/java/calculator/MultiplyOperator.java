package calculator;

public class MultiplyOperator implements InterfaceOperation {
    @Override
    public double operate(int firstNum, int secondNum) { return (double)firstNum * secondNum; }
}
