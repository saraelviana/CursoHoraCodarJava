package CursoHoraCodarJava.AulaArrays;

import java.util.Arrays;

public class ListaReferenceTrip {
    public static void main(String[] args) {
        // BASICAMENTE SAO A MESMA COISA, 1 PESSOA 2 RG DIFERENTES
        int [] arraysOriginal = {1,2,3,4,5};
        // DIGITAMOS VARIAS COISA E BLA BLA
        // DECIDIMOS USAR OS DADOS DA ARRAY LA DE CIMA EM OUTRO LUGAR
        int [] arraysCopia = arraysOriginal;
        // ALTERAMOS O VALOR DA ARRAY COPIA
        // ALTERAMOS O VALOR DA ARRAY ORIGINAL
        arraysCopia[0] = 99;
        // IMPRIMIMOS OS DOIS VALORES
        System.out.println("Array Original: ");
        System.out.println(Arrays.toString(arraysCopia));
        System.out.println(Arrays.toString(arraysOriginal));

        // AMBOS SAO ALTERADOS POIS APONTAM PARA O MESMO LOCAL NA MEMORIA
        // AGORA,COMO EVITAR ISSO ? 

        int[] arrayClone = arraysOriginal.clone();
        arrayClone[0] = 555;

        System.out.println("Array Original: ");
        System.out.println(Arrays.toString(arraysOriginal));
        System.out.println("Array Clone: ");
        System.out.println(Arrays.toString(arrayClone));
        // AGORA SIM, TEMOS DOIS LOCAIS DIFERENTES NA MEMORIA
        /**
         * Array Original: 
            [99, 2, 3, 4, 5]
            [99, 2, 3, 4, 5]
           Array Original:
            [99, 2, 3, 4, 5] - MANTEVE O 99 , PORQUE FOI ALTERADO ANTES DO CLONE
           Array Clone:
            [555, 2, 3, 4, 5]
         */
    }
}

