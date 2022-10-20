// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

package Java_Exceptions_HW.TASK_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Метод 2 (выход за границы массива)

public class Method2 {

    public static int[] fillArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
    
        }
        return array;

    }

    public static int  findElementByIndex(int[] array, int index) {
        
        if(index > array.length - 1){
            throw new ArrayIndexOutOfBoundsException ("В массиве отсутствует элемент по указанному индексу!");
        }
        return array[index];
    }

 
    public static void main(String[] args) {
        
        int sizeOfArray;
        int index;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            sizeOfArray = scanner.nextInt();
            System.out.print("Введите индекс: ");
            index = scanner.nextInt();

        }  
        
        int[] resultArray = fillArray(sizeOfArray);
        
        System.out.println(Arrays.toString(resultArray));
        System.out.printf("Элемент по указанному индексу %d: " , findElementByIndex(resultArray, index));

    }

}