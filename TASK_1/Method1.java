// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

package Java_Exceptions_HW.TASK_1;

import java.util.Scanner;


// Метод 1 (деление на ноль)

public class Method1 {

 
    public static double divisionMethod(double firstNumber, double secondNumber){

        double resultOfDiv = 0;
        if (secondNumber == 0){
            throw new ArithmeticException("На ноль делить нельзя!!!");
        }
        resultOfDiv = firstNumber / secondNumber;

        return resultOfDiv;        
    }


    public static void main(String[] args) {

        double num1;
        double num2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число(делимое): ");
            num1 = scanner.nextDouble();

            System.out.print("Введите второе число(делитель): ");
            num2 = scanner.nextDouble();
        }
        
        double result = divisionMethod(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }


}
