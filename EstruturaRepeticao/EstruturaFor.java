package CursoHoraCodarJava.EstruturaRepeticao;

public class EstruturaFor {
    public static void main(String[] args) {
        // VAMOS DETERMINAR UMA ESTRUTURA DE REPETIÇÃO COM O FOR
        // QUE VAI SER DO 1 AO 5

        // DEFINIR A VARIAVEL DE INICIALIZAÇÃO - QUE VAI SER O j OU i ETC..
        // DEFINIR A CONDIÇÃO DE CONTINUAÇÃO - ATÉ QUANDO VAI RODAR
        // DEFINIR O PASSO DE INCREMENTO OU DECREMENTO - E COMO A VARIAVEL VAI CHEGAR NA CONDIÇÃO DE PARADA
        // EXEMPLO: VAMOS IMPRIMIR OS NÚMEROS DE 1 A 5
        // for(int i = 1; i <= 5; i++)
        // 



        for(int i=0; i<=5; i++){
            System.out.println("Número: " + i);
        }
        // LETRAS

        /**
         * Por que isso funciona?

            Em Java, cada char tem um valor numérico interno (Unicode)

            'A', 'B', 'C'… são valores consecutivos

            O for consegue incrementar (c++) normalmente
         * 
         */


        for (char c = 'A'; c <= 'F'; c++) {
             System.out.println(c);
        }

        // IMPRIMIR CADA LETRA DA PALAVRA "JAVA"
        // USANDO O MÉTODO charAt() DA CLASSE STRING
        // charAt() PEGA O CARACTERE NA POSIÇÃO INFORMADA
        // A POSIÇÃO COMEÇA DO ZERO
        // J = 0
        // A = 1
        // V = 2
        // A = 3
        // palavra.length() RETORNA O TAMANHO DA PALAVRA
        // NO CASO 4
        String palavra="java";
        for(int i=0; i<palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }


        // LETRAS MINÚSCULAS
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

        // 4. Usando int para imprimir letras (não recomendado para iniciantes)
        // É possível, mas não é a forma correta didaticamente no começo:
        // Aqui acontece:
        // 65 é o código Unicode de 'A'
        //(char) i faz um cast (conversão de tipo)
        // Seu professor provavelmente vai explicar isso mais à frente.


        for (int i = 65; i <= 70; i++) {
            System.out.println((char) i);
        }

        // MISTURANDO LETRA E NUMEROS
        for (int i = 0; i <= 5; i++) {
         char letra = (char) ('A' + i);
           System.out.println(i + " - " + letra);
        }



    }
}
