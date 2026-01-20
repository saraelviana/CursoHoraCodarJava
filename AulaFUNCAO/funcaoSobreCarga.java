public class funcaoSobreCarga {
    public static void main(String[] args) {
        System.out.println(soma(2,3));
        System.out.println(soma(2,3,4));
        System.out.println(soma(2.2,3.3,4.4));
    }
    // VAMOS FAZER 3 FUNÇOES DE SOMA QUE ACEITAM NUMEROS
    // DIFERENTES DE PARAMETROS
    // 1. SOMA COM 2 PARAMETROS
    // 2. SOMA COM 3 PARAMETROS
    // TUDO E SOMA, MAS TEM Q TER TIPOS DIFERENTES

    public static int soma(int a, int b){
        return a + b ;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }

    public static double soma(double a, double b, double c){
        return a + b + c;
    }


}
