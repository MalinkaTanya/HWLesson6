package by.itacademy.operations;

public class Sqrt implements Operation {
    @Override
    public double execute(double... a) {
        return Math.sqrt(a[0]);
    }
}