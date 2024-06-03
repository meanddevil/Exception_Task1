package Seminar_3;

import java.io.IOException;
import java.util.Scanner;

public class DataGet {
     public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в порядке указанном ниже:\n" +
                    "<Фамилия> <Имя> <Отчество> <Дата рождения> <Телефон> <Пол>\n " +
                    "Пример:\n" +
                    "German Anna Olgovna 11.05.1936 89167848562 f\n");
            String inputData;
            inputData = scanner.nextLine();
            if (inputData.isEmpty()){
                throw new EmptyStringException("Строка является пустой");
            }

            inputData = inputData.replaceAll("\\s+", " "); // замена многих пробелов на один
            inputData = inputData.trim(); // удаление пробела в начале и в конце строки
            String[] Arraydata = inputData.split(" ");
            if (Arraydata.length == 6){
                Check.checkDateFormat(Arraydata[3]);
                Check.checkPhoneNumberFormat(Arraydata[4]);
                Check.checkGenderFormat(Arraydata[5]);
                DataWrite.createFile(Arraydata);
            } else {
                throw new ArrayCountElementException("Вы ввели не все данные или\n" +
                        "Вы пропустили пробел");
            }
        }

    }
}