package HoraDeCodarJava;

public class CondicoesTernarias {
    public static void main(String[] args) {
        // o IF TERNARIO
        int idade = 17;

        // AGORA QUERO SABER SE O NUMERO E PAR OU IMPAR
        String resultado = (idade % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("O NUMERO E: " + resultado);
        
    }
}
