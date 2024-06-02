package Seminar_2;

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
 // Введите свое решение ниже
        // if ( d == 0){
        //     System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        //     return Double.NaN;
        // }
        // else if (intArray.length < 8){
        //     System.out.println("intArray[8] / d as there is no 8th element in the given array.");
        //     return Double.NaN;
        // }
        // else{
        //     double result = intArray[8]/d;
        //     System.out.println("intArray[8] / d = {"+intArray[8]+"} / {"+d+"} = {"+result+"}");
        //     return result;
        // }
        
        try {
            double result = intArray[8]/d;
            System.out.println("intArray[8] / d = "+intArray[8]+" / "+d+" = " +result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }
    }

    }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer5 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}