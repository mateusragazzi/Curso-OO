public class Teste {
    public static void main(String[] args){
        Animal a = new Animal();
        a.setNome("Animal");
        a.comer();
        a.falar();

        a = new Gato();
        a.comer();
        a.falar();

        a = new Cachorro();
        a.comer();
        a.falar();

        // -------------------------
        Gato gato = new Gato();
        gato.comer();
        gato.falar();

//        gato = new Animal();
//        gato = new Cachorro();
    }
}









