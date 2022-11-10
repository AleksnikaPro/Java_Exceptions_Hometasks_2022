package TASK_3;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public String getData(String data) {
       System.out.printf("%s", data);
        return scanner.nextLine();
    }

    public void printData(String data) {
        System.out.printf("%s", data);
    }

    

    
}
