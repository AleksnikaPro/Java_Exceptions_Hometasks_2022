/*Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

// Задание 2
// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }

package Java_Exceptions_HW.TASK_2;

import java.util.Arrays;
import java.util.Random;

public class Task_2 {

    public static void method1(int[] intArray) {

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;// ArithmeticException (деление на ноль), ArrayIndexOutOfBoundsException (выход индекса некоторого типа за допустимые пределы)
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }  
        
    }  
    
    public static void main(String[] args) {
        
        int[] newArray = fillArray(10);
        System.out.println(Arrays.toString(newArray));
        method1(newArray);

    }

    public static int[] fillArray(int length) {
        
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
  
}





