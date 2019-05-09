public class Funcionario extends Pessoa {
    private float solario;

    public Funcionario(){
        // Deffault
    }
    public float getSalrio(){
        return this.solario;
    }
    public void setSolario(float salario){
        this.solario = salario;
    }
}
