/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package Java_Exceptions_HW.TASK_2;

import java.util.Scanner;

public class Task_4 {

    /**
     * @return text
     * @throws Exception e
     */
    public static String checkText() throws Exception {

        String text = "";
        System.out.print("Введите любой текст: ");
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
            scanner.close();
            if (text.trim().length() == 0){
                throw new Exception("Вы забыли ввести текст!");
            }      
            
        }

        return text;
    }

    public static void main(String [] args) {

        //String newText = "";
   
        try {
            String newText = checkText();
            System.out.println("Вы ввели следующий текст: " + newText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
}
