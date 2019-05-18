import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        float a = 5;
        float b = 0;

        try{
            float c = a / b;
            System.out.println("Div = " + c);
        }catch (Exception e){
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        try{
            a = input.nextFloat();
            b = input.nextFloat();
        }catch (InputMismatchException e) {
            // e.printStackTrace();
            throw new InputMismatchException("Erro ao ler os dados.");
        }
        calc(4, 9);
        calc2(2,0);
    }

    public static void calc(int a, int b) throws ArithmeticException{
        int c = a / b;
    }

    public static void calc2(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Tentou dividir por zero!");
        }
        int c = a / b;
    }
}






