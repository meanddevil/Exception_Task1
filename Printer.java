class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = {97,22,6};
        System.out.println(array[3]);
      
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
      int num = 100;
      int divisor = 0;
      int result = num / divisor;
      System.out.println(result);

}

    public static void numberFormatException() {
        // Напишите свое решение ниже
       String str = "Hi! I'm the problem";
       int num = Integer.parseInt(str);
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}