/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package Java_Exceptions_HW.TASK_2;

import java.util.Scanner;

/**
 * Task_1
 */
public class Task_1 {

    /**
     * @return
     * @throws Exception
     */
    public static float checkNumber() throws Exception {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            float value = 0.0f;
            System.out.print("Введите дробное число: ");

            try {

                value = scanner.nextFloat();
                scanner.close();

            } catch (Exception e) {
                System.out.println("Что-то пошло не так! Попробуйте снова! ");
                System.out.println("Catching exception: " + e);
                continue;
            }
            if(value % 1 == 0) { 
                throw new Exception("Вы ввели целое число, а не дробное!");
                          
            }           
            return value;

        }

    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        float number = checkNumber();
        System.out.printf("Вы ввели следующее дробное число: " + number);
    }

}


