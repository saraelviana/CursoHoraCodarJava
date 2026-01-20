public class funcaoString {
    public static void main(String[] args) {
        // FUNÇOES BUILT IN (PRONTAS) STRING
        // S - letra maiuscula e uma class String
        String nome = "Tranzar e muito bom";

        //FUNÇÃO LENGTH - MOSTRA O TAMANHO DA STRING,QTD DE CARACTERES
     
        System.out.println(nome.length());
        System.out.println(nome.substring(3,8)); //MOSTRA DO INDICE 3 ATE O 8
        System.out.println(nome.toUpperCase()); //TRANSFORMA EM MAIUSCULO
        System.out.println(nome.toLowerCase()); //TRANSFORMA EM MINUSCULO
        System.out.println(nome.replace("a", "o")); //SUBSTITUI AS LETRAS
        System.out.println(nome.replace("o", "a")); //SUBSTITUI AS LETRAS
        


    }
}
