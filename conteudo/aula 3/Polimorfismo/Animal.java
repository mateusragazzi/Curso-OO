public class Animal {

    private String nome;

    public String getNome(){
        return  this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println("Animal comendo...");
    }
    public void falar(){
        System.out.println("Animal falando...");
    }
}
