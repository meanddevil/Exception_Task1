package Seminar_2;

class IsFloat {
    public static float isFloat(String input) {
// Введите свое решение ниже        
        try{
            float result = Float.parseFloat(input);
            return result;
        }
        catch(NumberFormatException e){
            System.out.println("Your input is not a float number. Please, try again.");
            return  Float.NaN;
        }
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer4 {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "okm"; // По умолчанию используем "3.14", если аргумент не передан
        } 
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}