package CursoHoraCodarJava.AulaArrays;

public class ListaGBT {
    public static void main(String[] args) {
        // EXEMPLO  1 – Declaração e inicialização direta
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(numeros[0]); // 10
        System.out.println(numeros[2]); // 30

        // Exemplo 2 – Preenchendo o array manualmente
        int[] idade = new int[3];

        idade[0] = 18;
        idade[1] = 255;
        idade[2] = 30;
        System.out.println(idade[1]); // 25

        // Exemplo 3 – Percorrendo o array com for
        // length indica o tamanho do array
        int[] valores = {5, 10, 15, 200};

        for (int i = 1; i < valores.length; i++) {
        System.out.println(valores[i]);

        // 2. Array de letras (char)
         char[] letras = {'A', 'B', 'C', 'D'};

        for (int x = 0; x < letras.length; x++) {
            System.out.println(letras[x]);
         }
        }

        // Exemplo 5 – Montando uma palavra com char
        char[] nome = {'J', 'A', 'V', 'A'};

        for (char c : nome) {
        System.out.print(c);    
        }

        // 3. Array de textos (String)
        // Embora o professor tenha falado em letras, é importante saber que palavras usam String, não char.
        String[] frutas = {"Maçã", "Banana", "Uva"};

        for (int i = 0; i < frutas.length; i++) {
        System.out.println(frutas[i]);
        }

        // Exercício simples (estilo prova)
        int[] n = {2, 4, 6, 8};
        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }

        System.out.println("Soma: " + soma);



    }
}
