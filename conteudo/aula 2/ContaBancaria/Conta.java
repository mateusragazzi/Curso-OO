public class Conta implements CaixaEletronico {
    private Pessoa pessoa;
    private float saldo;
    private float chequeEspecial;

    public Conta(Pessoa pessoa, float chequeEspecial) {
        this.pessoa = pessoa;
        this.saldo = 0.0f;
        this.chequeEspecial = chequeEspecial;
    }

    public void depositar(float deposito) {
        this.saldo += deposito; // this.saldo = this.saldo + deposito
    }

    public void sacar(float saque) {
        if (checa(saque)) {
            saldo -= saque; // this.saldo = this.saldo - saque
        }
    }

    private boolean checa(float saque) {
        float aux = saldo - saque;
        if (chequeEspecial + saldo >= aux) {
            return true;
        } else {
            return false;
        }
    }

    public void calculaJuros(int qtdMes) {
        if (saldo < 0)
            System.out.println((saldo * 0.2) * qtdMes);
        else
            System.out.println("Não é necessário calcular!");
    }

    public void saldo() {
        System.out.println("Nome -> " + this.pessoa.getNome());
        System.out.println("Saldo -> " + this.saldo);
    }







}
