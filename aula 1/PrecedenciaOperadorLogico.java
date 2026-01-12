package HoraDeCodarJava;

public class PrecedenciaOperadorLogico {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        // 1. O NOT (!) tem a maior precedência
        // Aqui, !c é avaliado primeiro (torna-se true), depois faz o AND
        boolean resultado1 = a || b && !c; 
        
        // 2. O AND (&&) tem precedência sobre o OR (||)
        // Mesmo sem parênteses, (b && c) é calculado antes de "a || ..."
        boolean resultado2 = a || b && c; 

        System.out.println("Cenário 1 (a || b && !c): " + resultado1);
        System.out.println("Cenário 2 (a || b && c): " + resultado2);
        
        // Dica: Use parênteses para forçar a ordem ou clareza
        boolean resultadoComParenteses = (a || b) && c;
        System.out.println("Com Parênteses ((a || b) && c): " + resultadoComParenteses);



    }
}
