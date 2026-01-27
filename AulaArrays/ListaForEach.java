package CursoHoraCodarJava.AulaArrays;

public class ListaForEach {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero : num) {
            System.out.println("Número: " + numero);
        }

        // VERFICAR SE TEM ESTE VALOR NO ARRAY
        char[] LETRAS = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char busca = 'E'; // LETRA PROCURADA
        for (char letras : LETRAS) {
            if(letras == busca){
                System.out.println("Letra " + busca + " encontrada no estoque!");
            }

    }

 }
}
