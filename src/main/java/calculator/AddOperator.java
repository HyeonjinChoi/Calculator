package calculator;

public class AddOperator implements InterfaceOperation {
    @Override
    public double operate(int firstNum, int secondNum, char operator) { return (double)firstNum + secondNum; }
}
