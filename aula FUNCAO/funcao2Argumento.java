package HoraDeCodarJava;

public class funcao2Argumento {
    
    public static void main(String[] args) {
        // AQUI NESTE BLOCO VOCE CHAMA A FUNÇÃO
        SOMA(5, 10); // NESTE CASO EU ESTOU DANDO OS NUMEROS , MAS O USUARIO E QUE VAI DIGITAR
        
    }
    // AQUI VAMOS FAZER A FUNÇÃO
    // DENTRO DOS () VAMOS COLOCAR O ARGUMENTO
    // E UMA SOMA DE 2 INTEIROS

    public static void SOMA (int a, int b) {
        int resultado = a+b;
        System.out.println("A soma de " + a + " + " + b + " = " + resultado);

    }

}
