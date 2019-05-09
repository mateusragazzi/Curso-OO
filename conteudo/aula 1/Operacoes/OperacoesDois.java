public class OperacoesDois {

    private float result = 0;
    private float a;
    private float b;

    public OperacoesDois(float a, float b) {
        this.a = a;
        this.b = b;
        // Operações sobre (a,b)
        System.out.println("Operações sobre (" + a + "," + b + ")");
    }

    public float getResult() {
        return this.result;
    }

    public void calc() {
        this.add();
        this.sub();
        this.mult();
        this.div();
    }

    public void add() {
        this.result = this.a + this.b;
        System.out.println("Soma: " + this.getResult());
    }

    public void sub() {
        this.result = this.a - this.b;
        System.out.println("Subtração: " + this.getResult());
    }

    public void mult() {
        this.result = this.a * this.b;
        System.out.println("Multiplicação: " + this.getResult());
    }

    public void div() {
        if (this.b == 0) {
            System.out.println("Erro, divisão por zero!");
            this.result = 0;
        } else {
            this.result = this.a / this.b;
        }
        System.out.println("Divisão: " + this.getResult());
    }

    public static void teclado() {
        System.out.println(""
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão\n"
                + "5 - Todas as operações");
    }
}
