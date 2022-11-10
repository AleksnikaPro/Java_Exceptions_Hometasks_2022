package TASK_3.Exceptions;

import java.io.IOException;

public class InvalidGenderInput extends IOException{

    public InvalidGenderInput(String gender) {
        super("Введен НЕВЕРНЫЙ символ пола" + "!!!__" + gender + "__!!!\n");
    
    }
    
}
