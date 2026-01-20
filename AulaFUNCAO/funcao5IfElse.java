public class funcao5IfElse {
        public static void main(String[] args) {
            // CHAMANDO A FUNÇÃO
            String resultado = VerificAcess(19, true, false);
            System.out.println(resultado);

            
        }

        // PARA VERIFICAR ACESSO
        // VAI VERIFICAR 3 PARAMETROS
        // IDADE
        // CNH
        // HISTORICO NEGATIVO TEM QUE SER FALSO PARA TER ACESSO, ENTAO UMA COMPARAÇÃO SIMPLES
        // -> TemHistNegativo == false
        // COLOCANDO UM ! (NOT)  NA FRENTE DA VARIAVEL TAMBEM FUNCIONA
        // -> !TemHistNegativo

        public static String VerificAcess(int idade, boolean TemCnh, boolean TemHistNegativo) {

            // VAMOS PARA AS CONDICIONAIS
            if (idade >=18 && TemCnh && TemHistNegativo == false) {
                return "Acesso Permitido, todos os Criterios atendidos";
               // System.out.println("ACESSO PERMITIDO");
                
            }else{
                return"Acesso Negado, um ou mais criterios não atendidos";
            }
            
        }
    }

