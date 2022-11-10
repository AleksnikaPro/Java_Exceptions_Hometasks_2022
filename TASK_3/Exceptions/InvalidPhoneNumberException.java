package TASK_3.Exceptions;

import java.io.IOException;

public class InvalidPhoneNumberException extends IOException{

    public InvalidPhoneNumberException(String phoneNumber) {
        super("Номер телефона введен НЕВЕРНО" + "!!!__" + phoneNumber + "__!!!\n");
    }  
    
}
