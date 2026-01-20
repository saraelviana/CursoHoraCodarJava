package HoraDeCodarJava;

public class OperadorLogicoOR {
    public static void main(String[] args) {
        // QUEM PODE VER ESTE CONTEUDO?  OU USUARIOS AUTENTICADOS OU USUARIOS QUE SAO ADMINS
        
        boolean EstaChovendo = true;
        boolean EstaSemGuardaChuva = true;

        System.out.println("Pode sair? " + (EstaChovendo == false || EstaSemGuardaChuva == false));
        //  PARA O OR BASTA 1 SER VERDADEIRA PARA SER TRUE
        // COM IF AGORA
        int numero = 10;
        int numero2 = 5;
        if (numero > 10 || numero2 < 10) {
            System.out.println("Um dos valores e verdadeiro");
        } else {
            System.out.println("Os dois valores sao falsos");
            
        }
    }
}
