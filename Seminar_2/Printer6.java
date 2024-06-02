package Seminar_2;

class Expr6 {

    public static double expr(int a, int b) {
 // Введите свое решение ниже
        if(b != 0){
            double result = (double)a / b; 
            printSum(a, b);
            return result;
        }
        else{
            printSum(a, b);
            return 0;
        }
       

}

    public static void printSum(int a, int b) {
 // Введите свое решение ниже
        System.out.println(a+b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer6 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 100; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr6.expr(a, b);
        System.out.println(result);
    }
}