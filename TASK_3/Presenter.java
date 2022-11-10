package TASK_3;

import java.io.IOException;
import TASK_3.Exceptions.InvalidDateOfBirthFormatException;
import TASK_3.Exceptions.InvalidFormatNameInputException;
import TASK_3.Exceptions.InvalidGenderInputException;
import TASK_3.Exceptions.InvalidPhoneNumberException;

public class Presenter {
    final private View view;
    final private CheckModel model;

    public Presenter(View view, CheckModel model) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick() throws IOException {

        boolean process = true;
        String str = """
                Введите следующие данные одной строкой через пробел
                
                Фамилия Имя Отчество ДатаРождения НомерТелефона Пол
                     
                Образец: Сидоров Петр Иванович 01.01.1978 89284657387 m (женский пол - f)
                
                Для выхода из программы введите 'exit':\040
                """;
        while (process) {

            String inputData = view.getData(str);

            if (inputData.equals("exit")) {
                break;
            } else {
                String[] splittedInputData = inputData.split("\\s+");// Чтобы сгруппировать последовательные пробелы в один разделитель  - квантификатор "\\s+"

                int number = model.checkNumberOfInputElements(splittedInputData.length);
                if (number == -1) {
                    view.printData("Вы ввели меньше данных, чем требуется!\n");
                } else if (number == 0) {
                    view.printData("Вы ввели больше данных, чем требуется!\n");
                } else {

                    try {

                        String lastName = model.checkName(splittedInputData[0]);
                        String firstName = model.checkName(splittedInputData[1]);
                        String patronymic = model.checkName(splittedInputData[2]);
                        String dateOfBirth = model.checkDateOfBirth(splittedInputData[3]);
                        String phoneNumber = model.checkPhoneNumber(splittedInputData[4]);
                        String gender = model.checkGender(splittedInputData[5]);

                        final String result = lastName + " " + firstName + " " + patronymic + " " +
                                dateOfBirth + " " + phoneNumber + " " + gender;

                        FileManager fm = new FileManager();
                        fm.writeInfoIntoFile(result);
                        view.printData("Все данные введены верно и успешно записаны в файл!");
                        process = false;

                    } catch (InvalidFormatNameInputException | InvalidPhoneNumberException |
                             InvalidDateOfBirthFormatException | InvalidGenderInputException e) {
                        e.printStackTrace();
                        view.printData(e.getMessage());
                    }

                }

            }

        }

    }

}
