package by.itacademy.operations;

public class Division implements Operation {
    @Override
    public double execute(double... a) throws OperationExecutionException {
        if (a[1] == 0) throw new OperationExecutionException("Division by zero is forbidden!");
        return a[0] / a[1];
    }
}