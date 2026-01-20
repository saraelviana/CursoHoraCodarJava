package HoraDeCodarJava;

public class EstruturaCondicaoIfElse {
    public static void main(String[] args) {
        double nota = 7;
        if (nota <= 4.9) {
            System.out.println("Reprovado");
        } else if (nota>=7.9) {
            System.out.println("acima da media");
        } else {
            System.out.println("Aprovado");
        }
    }
}
