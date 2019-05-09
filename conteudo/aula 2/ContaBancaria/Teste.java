public class Teste {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("João", "Rua dos bobos, nº 0", "33333");

        Conta conta = new Conta(p1, 500f);
        conta.deposito(200);
        conta.imprimir();
        conta.saque(200);
        conta.imprimir();
        conta.calculaJuros(1);
    }
}
