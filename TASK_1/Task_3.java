/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов 
не равны, необходимо как-то оповестить пользователя.*/

package Java_Exceptions_HW.TASK_1;

import java.util.Arrays;

public class Task_3{

    /**
     * @param array1
     * @param array2
     * @return
     */
    public static int[] getNewArray(int[] array1, int[] array2) {

        if (array1.length != array2.length){
            throw new RuntimeException("Входящие массивы разной длины!!!");
        }
            
        int[] newArray = new int[array1.length];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = array1[i] - array2[i];
           
        }
        return newArray;
       
    }

    public static void main(String[] args) {

        int[] array1 = { 10, 9, 8, 7, 9};
        int[] array2 = { 1, 2, 3, 4};

        int[] resultArray = getNewArray(array1, array2);

        System.out.println(Arrays.toString(resultArray));  
        
    }

}

// [I@3fee733d
// [I@3fee733d
// [I@3fee733d
// [I@3fee733d

// That’s how Java prints arrays. You’ll need to wrap the array in Arrays.toString(array) 
// or alternatively loop over the array printing out results






