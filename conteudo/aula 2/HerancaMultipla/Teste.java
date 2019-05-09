public class Teste {
    public static void main(String[] args){
        Animal a  = new Animal();
        a.setPeso(23);
        a.setTamanho(120);

        Mamifero m = new Mamifero();
        m.setPeso(25);
        m.mamar();

        Ave ave1 = new Ave();
        ave1.porOvos();

        Ornitorrinco or = new Ornitorrinco();
        or.mamar();
        or.porOvos();
    }
}











