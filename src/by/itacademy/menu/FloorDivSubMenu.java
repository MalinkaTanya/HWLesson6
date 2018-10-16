package by.itacademy.menu;

import by.itacademy.operations.FloorDiv;
import by.itacademy.operations.Operation;
import by.itacademy.operations.OperationExecutionException;

import java.util.Scanner;

public class FloorDivSubMenu implements SubMenu {
    private Operation floorDiv = new FloorDiv();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнды:");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        try {
            System.out.println(floorDiv.execute(operand1, operand2));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        return "Возвращает самое большое значение, которое меньше чем или равно алгебраическому частному";
    }
}
