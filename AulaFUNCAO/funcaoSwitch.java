public class funcaoSwitch {
    public static void main(String[] args) {
        // CHAMANDO A FUNÇÃO DIA DA SEMANA
        int dia = 3;
        System.out.println(obterDiaSemana(dia));
        
        
 }
    public static String obterDiaSemana(int dia) {
    String nomeDia;

    switch (dia) {
        case 1:
            nomeDia = "Domingo";
            break;
        case 2:
            nomeDia = "Segunda-feira";
            break;
        case 3:
            nomeDia = "Terça-feira";
            break;
        case 4:
            nomeDia = "Quarta-feira";
            break;
        case 5:
            nomeDia = "Quinta-feira";
            break;
        case 6:
            nomeDia = "Sexta-feira";
            break;
        case 7:
            nomeDia = "Sábado";
            break;
        default:
            nomeDia = "Dia inválido";
    }

    return nomeDia;
}



    

    // o INTERO VAI REPRESENTAR O DIA DA SEMANA
    // CADA CASE VAI VALER UM NUMERO
    // SE O NUMERO FOR O QUE O USUARIO SOLICITOU EU TENHO O DIA DA SEMANA
    // E ESTE RETORNO , JA E O RETORNA DA FUNÇÃO
    // NESTE CASO PODE ATE DISPENSAR O BREAK ,POIS NUMERO SELECIONADO A FUNÇÃO TERMINA
    
    
 
}
