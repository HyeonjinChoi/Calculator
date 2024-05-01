package calculator;

public class SubtractOperator extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum, char operator) { return (double)firstNum - secondNum; }
}
