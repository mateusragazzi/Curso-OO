import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
//        Notepad tarefas = new Notepad("Tarefas");
//
//        tarefas.insert("Estudar para prova de POO");
//        tarefas.insert("Não procrastinar...");
//        tarefas.insert("Buscar o almoço");
//
//        tarefas.print();
//        tarefas.removeIndex(2);
//        tarefas.print();
//        tarefas.removeIndex(99);
//        tarefas.print();
//        tarefas.clear();
//        tarefas.print();
        int sair = 0;
        int opcao = 0;
        Notepad tarefas = new Notepad("Tarefas");
        Scanner input = new Scanner(System.in);

        while (sair == 0){
            Notepad.prompt();
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    String nota = JOptionPane.showInputDialog("Digite a nota que deseja inserir:");
                    tarefas.insert(nota);
                    break;
                case 2:
                    System.out.println("");
                    int i = Integer.parseInt(JOptionPane.showInputDialog("Digite a indice da nota que deseja remoevr:"));
                    tarefas.removeIndex(i);
                    break;
                case 3:
                    tarefas.print();
                    break;
                case 4:
                    tarefas.clear();
                    break;
                case 5:
                    sair = 1;
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }
    }
}