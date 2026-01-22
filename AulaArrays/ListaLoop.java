package CursoHoraCodarJava.AulaArrays;

public class ListaLoop {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;
        for(int i=0;i<8;i++){

            // NAS INTERAÇOES VAI TER O i=0,i=1,i=2...
            soma += numeros[i];
        }
        System.out.println("A soma dos numeros é: " + soma);
        
    }

}
