package by.itacademy.menu;

import by.itacademy.operations.Multiplication;
import by.itacademy.operations.Operation;
import by.itacademy.operations.OperationExecutionException;

import java.util.Scanner;

public class MultiplicationSubMenu implements SubMenu {
    private Operation multiplication = new Multiplication();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнды:");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        try {
            System.out.println(multiplication.execute(operand1, operand2));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        return "Умножение";
    }
}
