public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(){
        // Deffault
    }

    public String getNome(){
        return  this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return  this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String info(){
        String info = "Meu nome é " + this.nome + ", email = " + this.email;
        return info;
    }
}















