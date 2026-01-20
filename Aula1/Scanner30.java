package HoraDeCodarJava;
import java.util.Scanner; // aqui estamos chamando ele

public class Scanner30 {
    public static void main(String[] args){
        // testando scanner
        // 1 criar uma variavel tipo scaner

        Scanner scan = new Scanner(System.in);// Aqui estamos iniciando o scanner
        System.out.println("Digite o seu nome:");

        // depois crio uma variavel parareber o que foi digitado
        String nome = scan.nextLine(); // aqui estamos recebendo o que foi digitado

        System.out.println("O nome digitado foi: " + nome); // aqui estamos imprimindo o que foi digitado
        //--------

        System.out.println("Digite o numero qualquer");
        int Num = scan.nextInt();
        System.out.println("O numero digitado foi: " + Num);

        //---------
        // ´problema no Nextln

        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("A idade digitada foi: " + idade);
        scan.nextLine(); // aqui estamos "consumindo" o enter que sobrou do nextInt()

        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome= scan.nextLine(); // aqui o scanner "pula" a entrada
        System.out.println("O sobrenome digitado foi: " + sobrenome);

        // Aqui quando voce inicia com puxando um numero com o nextInt() e depois tenta puxar uma String com o nextLine()
        // o scanner "pula" a entrada do nextLine() pq ele entende que o enter do numero anterior ja é uma entrada
        // para resolver esse problema, precisamos adicionar um scan.nextLine() extra
        // para "consumir" o enter que sobrou do nextInt()
        // assim : scan.nextLine(); // aqui estamos "consumindo" o enter que sobrou do nextInt()
        



        scan.close(); // fechando o scanner
    }
    
}
