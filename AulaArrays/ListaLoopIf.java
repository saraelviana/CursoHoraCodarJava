package CursoHoraCodarJava.AulaArrays;

public class ListaLoopIf {
    public static void main(String[] args) {
        // FILTRA E SOMAR NUMEROS PARES DE UMA ARRAY
        // UM LOOP QUE PODEMOS ESTAR CONDICIONALMENTE SOMANDO OS NUMEROS PARES
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numGrande = {30,28,60,70,76,90,1,200};

        int SomaPares = 0;
        for (int numero : num) {
            if (numero % 2 == 0) {
                SomaPares += numero;
            }

        }

        int NumLimt = 50; // NUMERO ESTIPULADO PARA FILTAR
        for (int i=0;i<=numGrande.length;i++){
            if (numGrande[i]>=NumLimt) {
                System.out.println("Números maiores ou iguais a " + NumLimt + ": " + numGrande[i]);
                
            }
        }

        System.out.println("Soma dos números pares: " + SomaPares); // Saída: Soma dos números pares: 30
    }

}
