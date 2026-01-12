package HoraDeCodarJava;

public class ComparacaoDstring {

    public static void main(String[] args) {

    String str1 = "java";
    String str2 = new String("java");

    System.out.println(str1 == "java"); // false
    System.out.println(str1.equals(str2)); // true

    // metodo equals compara o conteudo

    System.out.println(str1.equalsIgnoreCase(str2)); // true  
    // metodo equalsIgnoreCase compara o conteudo ignorando maiusculas e minusculas
    }
    



}
