public class Operacoes {
    // Atributos
    private float result;
    // Operações
    public float add(float a, float b){
        result = a + b;
        return result;
    }
    public float sub(float a, float b){
        result = a - b;
        return result;
    }
    public float mult(float a, float b){
        result = a * b;
        return result;
    }
    public float div(float a, float b){
        if(b == 0){
            System.out.println("Erro, divisão por zero!");
            result = 0;
        }else{
            result = a / b;
        }
        return result;
    }
}
