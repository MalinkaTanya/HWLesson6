package by.itacademy.operations;

public class Addition implements Operation {
    @Override
    public double execute(double... a) throws OperationExecutionException {
        return a[0] + a[1];
    }
}

