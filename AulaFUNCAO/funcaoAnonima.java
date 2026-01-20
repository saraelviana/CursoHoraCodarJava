import java.util.Arrays;
import java.util.List;

public class funcaoAnonima {
    public static void main(String[] args) {
        // Em Java, uma função anônima é mais conhecida como Expressão Lambda.

        //Historicamente, o Java sempre exigiu que tudo estivesse dentro de uma classe e tivesse um nome. A partir do Java 8, as funções anônimas foram introduzidas para permitir que você escreva um bloco de código (uma função) sem precisar criar uma classe ou definir um nome para o método.

        /**
         * Exemplo Detalhado: Filtrando uma Lista
            Vamos supor que você tem uma lista de nomes e quer imprimir apenas os nomes que começam com a letra "A".


         */

            List<String> nomes = Arrays.asList("Ana", "Bob", "Alice");

        // Função anônima: (nome) -> lógica
        nomes.forEach(nome -> {
            if (nome.startsWith("A")) {
            System.out.println(nome);
            // Saída: Ana, Alice
    }
        });
    }
}

// Anatomia de uma Função Anônima em Java
//A estrutura básica de uma Lambda é:
//(parametros)→{corpodafunção}

