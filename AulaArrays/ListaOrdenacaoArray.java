package CursoHoraCodarJava.AulaArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ListaOrdenacaoArray {
    public static void main(String[] args) {
        // 1 - ORDENADO
        // ORDENAÇÃO DE ARRAYS INTEIROS
        int[] numeros = {5, 3, 8, 1, 2,9};

        // QUANDO ELE E ORGANIZADO , PERDE-SE A POSIÇÃO ORIGINAL DOS ELEMENTOS
        Arrays.sort(numeros);
        System.out.println("Array de inteiros ordenado: " + Arrays.toString(numeros));
        ///----
        // 2 - ORDENAÇÃO POR COMPARAÇÃO
        String[] nomes = {"Maria", "João", "Ana", "Carlos"};
        Arrays.sort(nomes);
        Arrays.sort(nomes, Comparator.reverseOrder());// POR ORDEM INVERTIDA
        System.out.println("Array de Strings ordenado em ordem decrescente: " + Arrays.toString(nomes)); // ALFABETICA DECRESCENTE
        // ------
        // 3 - ORDENAÇÃO DE MATRIZES
        int [] [] matriz = {
                {3, 5, 1},
                {4, 2, 6},
                {9, 7, 8}
        };
        Arrays.sort(matriz , Comparator.comparingInt(a -> a[0])); // ORDENA PELA PRIMEIRA COLUNA
        System.out.println(Arrays.toString(matriz));

        // NAO PODE USAR - SORT - Arrays.sort-   EM 2 DIMENSOES 

        System.out.println("metodo - deepToString-" + Arrays.deepToString(matriz));

        System.out.println("Matriz ordenada pela primeira coluna: " + Arrays.deepToString(matriz));
    }

}
