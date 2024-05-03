package calculator;

public class AddOperator implements InterfaceOperation {
    @Override
    public double operate(int firstNum, int secondNum) { return (double)firstNum + secondNum; }
}
