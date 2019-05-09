
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        System.out.println("Adição: " + op.add(8, 4));
        System.out.println("Subtração: " + op.sub(8, 4));
        System.out.println("Multiplicão: " + op.mult(8, 4));
        System.out.println("Divisão: " + op.div(8, 0));

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o 1º valor:");

        float a = entrada.nextFloat();
        System.out.println("Entre com o 1º valor:");

        float b = entrada.nextFloat();
        System.out.println("Entre com o opção desejada:");

        OperacoesDois.teclado();
        OperacoesDois op2 = new OperacoesDois(a, b);

        int opcao = entrada.nextInt();
        switch (opcao) {
        case 1:
            op2.add();
            break;
        case 2:
            op2.sub();
            break;
        case 3:
            op2.mult();
            break;
        case 4:
            op2.div();
            break;
        case 5:
            op2.calc();
            break;
        default:
            System.out.println("Opção inválida!");
        }
    }
}
