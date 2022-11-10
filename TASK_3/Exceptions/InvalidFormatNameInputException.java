package TASK_3.Exceptions;

import java.io.IOException;

public class InvalidFormatNameInputException extends IOException {
    public InvalidFormatNameInputException(String name) {
        super("НЕВЕРНЫЙ ввод фамилии/имени/отчества" + "!!!__" +  name + "__!!!\n");
    }  
}
