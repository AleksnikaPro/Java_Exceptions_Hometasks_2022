package TASK_3.Exceptions;

import java.io.IOException;

public class InvalidDateOfBirthFormatException extends IOException{

    public InvalidDateOfBirthFormatException(String dateOfBirth) {
        super("НЕКОРРЕКТНЫЙ формат ввода даты рождения" + "!!!__" + dateOfBirth + "__!!!\n");
    }
    
    
}
