package HoraDeCodarJava;

public class OperadorSwith {
    public static void main(String[] args) {
        // VALIDAR O DIA DA SEMANABASEADO EM 1 NUMERO
        // 1 E IGUAL A DOMINGO
        // 7 E IGUAL A SABADO
        int DiaSemana = 5;

        switch (DiaSemana) { // O QUE SERA AVALIADO E O DIA DA SEMANA
            
            case 1: // UM CASE NAO VAI TER UMA EXPRESSAO DE COMPARAÇÃO , ELA TERA UM VALOR DIRETO
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda-Feira");
            case 3:
                System.out.println("Terca-Feira");
            case 4:
                System.out.println("Quarta-Feira");
            case 5:
                System.out.println("Quinta-Feira");
            case 6:
                System.out.println("Sexta-Feira");
            case 7:
                System.out.println("Sabado");
                break;
        
            default:
                System.out.println("Dia da semana invalido"); // CASO NAO SEJA NENHUM DOS CASES ACIMA
                break;
        }
    }
}
