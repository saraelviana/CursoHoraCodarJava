package HoraDeCodarJava;

public class funcao3Retorn {
    public static void main(String[] args) {
        // AQUI NESTE BLOCO VOCE CHAMA A FUNÇÃO
        saudar("João");

        dobrar(5); // AQUI EU CHAMEI A FUNÇÃO DOBRAR, MAS NÃO FIZ NADA COM O RESULTADO
        int resultado = dobrar(5); // AQUI EU CHAMEI A FUNÇÃO DOBRAR E ARMAZENEI O RESULTADO NA VARIÁVEL
        // AGORA POSSO USAR ESSA VARIÁVEL IMPRIMINDO-A
        System.out.println("O dobro de 5 é: " + resultado);
    }
    public static void saudar(String nome){
        System.out.println("Seja bem vindo " + nome);
    }

    // VOU DIZER QUE O NUMERO DOBRAVEL VAI SER UM INTEIRO - POR ISSO USO INT EM VEZ DE VOID

    public static int dobrar(int num){
        return num * 2;
    }

}
