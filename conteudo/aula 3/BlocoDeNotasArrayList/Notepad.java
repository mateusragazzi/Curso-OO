import java.util.ArrayList;

public class Notepad {

    private ArrayList<String> lista;
    private String nome;

    public Notepad(String nome){
        lista = new ArrayList<>();
        this.nome = nome;
        System.out.println("Novo bloco de notas criado: " + this.nome);
    }
    public void insert(String nota){
         lista.add(nota);
    }
    public void removeIndex(int i){
        System.out.println("Tentando remover o indice: " +i);
        if(i > lista.size()){
            // throw new IndexOutOfBoundsException("Tentou remover um indice que não existe!");
            System.out.println("O indice " +i+" não existe na lista " + this.nome);
        }else{
            lista.remove(i);
        }

    }
    public void clear(){
        System.out.println("Limpando bloco de notas: " + this.nome);
        lista.clear();

    }
    public void print(){
        System.out.println("Imprimindo bloco de notas: " + this.nome);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nota " + i + " : " + lista.get(i));
        }
    }
    public static void prompt(){
        System.out.println("1 - Inserir\n" +
                "2 - Remover por índice\n" +
                "3 - Imprimir bloco de notas\n" +
                "4 - Limpar o bloco de notas\n" +
                "5 - Sair");
    }

//    public ArrayList<String> getLista() {
//        lista.add();
//        lista.remove();
//        lista.get();
//        lista.clear();
//        return this.lista;
//    }
}

/*


*/