public class Teste {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mario");
        pessoa.setEmail("mario@armario.com");
        System.out.println(pessoa.info());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Mateus");
        aluno1.setEmail("mateus@email.com");
        aluno1.setRGA("2018.29292.0202");
        System.out.println(aluno1.info());

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Augusto");
        funcionario.setEmail("augusto@email.com");
        funcionario.setSolario(800);
        System.out.println(funcionario.info() + ". Salario = " + funcionario.getSalrio());


//        Pessoa p2 = new Aluno();
//        Aluno a2 = new Pessoa();
//        Aluno a3 = new Funcionario();
    }
}










