public class funcaoRecursiva {
    public static void main(String[] args) {
        int soma = somaRecursiva(5);
        System.out.println("A soma dos números de 1 a 5 é: " + soma);
        
    }
    public static int somaRecursiva(int n) {
        if (n == 1) { // -> condição de parada
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }// O RESULTADO E 15
    }
}
/**
 * somaRecursiva(1) = 1
 
* somaRecursiva(2) = 2 + somaRecursiva(1) = 2 + 1 = 3
 * somaRecursiva(3) = 3 + somaRecursiva(2) = 3 + 3 = 6
 * somaRecursiva(4) = 4 + somaRecursiva(3) = 4 + 6 = 10
 * somaRecursiva(5) = 5 + somaRecursiva(4) = 5 + 10 = 15
 */





