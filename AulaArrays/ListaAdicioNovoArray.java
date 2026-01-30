package CursoHoraCodarJava.AulaArrays;
// 1. Você precisa desta importação:
import java.util.Arrays; // Sem isso fica dando erro na no System.out.println(Arrays.

public class ListaAdicioNovoArray {
    public static void main(String[] args) {
        int [] numero = {1, 2, 3, 4, 5};
        int [] novoArray = new int[numero.length + 1];
        for (int i = 0; i < numero.length; i++) {
            novoArray[i] = numero[i];
        }
        System.out.println(Arrays.toString(novoArray));
        // VAMOS ADICIONAR UM NOVO ELEMENTO NO NOVO ARRAY
        // ACESSAR O ULTIMO INDICE DO NOVO ARRAY
        // E COLOCAR O ELEMENTO LA
        // O NUMERO DE ELEMENTO DO ARRAY TEM 1 NUMERO A MAIS QUE O INDICE POIS CONTA COMO ZERO


        novoArray[novoArray.length - 1] = 6; 
        // ADICIONANDO O NUMERO 6 NO ULTIMO INDICE DO NOVO ARRAY
        // POIS COMO ACESSAR O ULTIMO ELEMENTO SE VOCE NAO SOUBER QUANTOS TENS

        System.out.println(Arrays.toString(novoArray));

        //-------------------------------
        // USANDO O METODO COPYOF DA CLASSE ARRAYS
        // Arrays.copyOf(arrayOriginal, novoTamanho)
        // Ele cria um novo array, copia os dados e já define o novo tamanho
        int[] NovoArray = Arrays.copyOf(numero, numero.length + 1);

        // Adicionando um valor na última posição (que agora existe!)
        NovoArray[NovoArray.length - 1] = 6;

        System.out.println("Array Original: " + Arrays.toString(numero));
        System.out.println("Novo Array: " + Arrays.toString(NovoArray));
    }
   
    

}

/**
 * Explicação:
 * - Primeiro, criamos um array original chamado `numero` com alguns valores.
 * - Em seguida, criamos um novo array chamado `NovoArray` com um tamanho maior (um elemento a mais).
 * - Usamos o método `Arrays.copyOf` para copiar os elementos do array original para o novo array.
 * - Depois, adicionamos um novo valor na última posição do novo array.
 * - Finalmente, imprimimos ambos os arrays para mostrar o resultado.
 * 
 */


