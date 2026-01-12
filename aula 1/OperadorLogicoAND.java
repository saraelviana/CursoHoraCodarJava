package HoraDeCodarJava;

public class OperadorLogicoAND {
    // LOCAL COMUN DE CHECK = ESTA COM SALDO NA CARTEIRA E ESTA HABILITADO PARA COMPRAR O CURSO
    // SE ELE NAO TIVER SALDO NA CARTEIRA E NAO ESTIVER HABILITADO PARA COMPRAR O CURSO, NAO PODE COMPRAR
    public static void main(String[] args) {
        // TESTE, VERIFICAR SO O USUARIO PODE DIRIGIR-- TEM QUE ESTA HABILITADO E TER IDADE MINIMA
        // ESTE SAO OS 2 ITENS NECESSARIO AQUI NO BRASIL 
        int idade = 15;
        boolean EstaHabilitado = true;

        // SE TEM QUE SER TUDO  TRUE == TRUE  ENTAO DEIXA PARA SER CONFIRMADO COM 1 JA BASTA > TRUE (VARIAVEL BOOLEANA)
        System.out.println("Pode dirigir? " + (idade >= 18 && EstaHabilitado));

        // System.out.println("Pode dirigir? " + (idade >= 18 && EstaHabilitado == true)); E A MESMA COISA

        // COM UM IF AGORA
        int numero = 10;
        int numero2 = 5;
        if (numero > 10 && numero2 <5) {
            System.out.println("Os dois valores sao verdadeiros");
        } else {
            System.out.println("Um dos valores e falso");
            
        }


    }
}
