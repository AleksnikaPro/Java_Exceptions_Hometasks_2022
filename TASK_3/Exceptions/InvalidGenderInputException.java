package TASK_3.Exceptions;

import java.io.IOException;

public class InvalidGenderInputException extends IOException{

    public InvalidGenderInputException(String gender) {
        super("Введен НЕВЕРНЫЙ символ пола" + "!!!__" + gender + "__!!!\n");
    
    }
    
}
