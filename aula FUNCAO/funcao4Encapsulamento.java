package HoraDeCodarJava;

public class funcao4Encapsulamento {
    public static void main(String[] args) {
        // AQUI NESTE BLOCO VOCE CHAMA A FUNÇÃO
        // Encapsula e ter meu resultado em variaveis

        // ESTA USANDO O STRING LA DA FUNÇÃO PARA ENCAPSULA AQUI AS VARIAVES

        String r1= verificarPar(7); // UMA USANDO O NOME DA VARIAVEL
        

        System.out.println(r1);
        

        

        
    }
    // FUNÇÃO VERIFICAR SE E PAR OU IMPAR
    
    public static String verificarPar(int num){
        if (num % 2 == 0) {
            return " o numero "+ num +" é PAR";
        }else{
            return " o numero "+ num +" nao é IMPAR";
        }

    }
    
}
