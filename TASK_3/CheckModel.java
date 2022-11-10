package TASK_3;

import TASK_3.Exceptions.InvalidDateOfBirthFormatException;
import TASK_3.Exceptions.InvalidFormatNameInputException;
import TASK_3.Exceptions.InvalidGenderInput;
import TASK_3.Exceptions.InvalidPhoneNumberException;

public class CheckModel {

    public CheckModel() {
    }

    public int checkNumberOfInputElements(int length) {

        int rightNumberOfElements = 6;

        if (length < rightNumberOfElements) {
            return -1;
        } else if (length > rightNumberOfElements) {
            return 0;
        } else {

            return length;
        }

    }

    public String checkName(String name) throws InvalidFormatNameInputException {

        boolean flag;
        String namePattern1 = "[а-яёА-ЯЁ]+"; // в имени только буквы
        flag = name.matches(namePattern1);

        if (!Character.isUpperCase(name.charAt(0)) || !flag) {
            throw new InvalidFormatNameInputException(name);
        }
        return name;
    }

    public String checkDateOfBirth(String dateOfBirth) throws InvalidDateOfBirthFormatException {

        boolean flag;
        String dateOfBirthPattern = "(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((18|19|20|21)\\d\\d)";
        flag = dateOfBirth.matches(dateOfBirthPattern);
        if (!flag) {
            throw new InvalidDateOfBirthFormatException(dateOfBirth);
        }
        return dateOfBirth;
    }


    public String checkPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {

        boolean flag1;
        boolean flag2;

        String phonePattern1 = "^\\d{11}$";// количество чисел 11
        String phonePattern2 = "^[0-9]+$";// содержит только числа

        flag1 = phoneNumber.matches(phonePattern1);
        flag2 = phoneNumber.matches(phonePattern2);

        if (phoneNumber.charAt(0) != '8' || !flag1 || !flag2) {
            throw new InvalidPhoneNumberException(phoneNumber);
        }
        return phoneNumber;
    }


    public String checkGender(String gender) throws InvalidGenderInput {

        if (gender.charAt(0) != 'f' && gender.charAt(0) != 'm' ) {
            throw new InvalidGenderInput(gender);
        }
        return gender;
    }


}