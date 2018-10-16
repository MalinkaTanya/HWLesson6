package by.itacademy.operations;

public interface Operation {
    double execute(double... a) throws OperationExecutionException;
}
