package HoraDeCodarJava;

public class EncadeamentoIfElse {
    public static void main(String[] args) {
        int idade = 20;
        boolean acompanhado = true;

        if (idade < 18) {

            // AQUI SERIA OUTRO IF DENTRO DO PRIMEIRO IF
            // AVALIAR OUTROS CRITÉRIOS

            if (acompanhado) {
                System.out.println("Você é menor de idade, mas está acompanhado.");
            } else {
                System.out.println("Você é menor de idade e não está acompanhado.");
            }
            
    }else{
            System.out.println("Você é maior de idade.");
    }
}
}
