/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */

package Java_Exceptions_HW.TASK_1;

import java.util.Arrays;

public class Task_4 {

    /**
     * @param array1
     * @param array2
     * @return
     */
    public static int[] getNewArray(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            throw new RuntimeException("Входящие массивы разной длины!!!");
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("В массиве есть цыфра ноль!!! На ноль делить нельзя!!!");
            
            }
        }       

        int[] newArray = new int[array1.length];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = array1[i] / array2[i];

        }
        return newArray;

    }

    public static void main(String[] args) {

        int[] array1 = { 10, 8, 9, 5};
        int[] array2 = { 2, 1, 3, 5};

        int [] resultArray = getNewArray(array1, array2);

        System.out.println(Arrays.toString(resultArray));

    }

}