// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

package Java_Exceptions_HW.TASK_1;

// Метод 3 (неверные параметры)

public class Method3 {

    public static Object printNumber(Object num){
       
        if (num == null){

            throw new IllegalArgumentException("Num не должен быть null");

        }
        return num;

    }

    public static void main(String[] args) {
        
        Object num;
        num = 10;  
        // num = null;    
        
        System.out.print(printNumber(num));                

    }

}

