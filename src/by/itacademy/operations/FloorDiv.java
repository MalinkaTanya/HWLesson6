package by.itacademy.operations;

public class FloorDiv implements Operation {
    @Override
    public double execute(double... a) throws OperationExecutionException {
        if (a[1] == 0) throw new OperationExecutionException("Second operand cannot equal zero!");
        return Math.floorDiv((int) a[0], (int) a[1]);
    }
}
