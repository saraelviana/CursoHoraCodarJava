package CursoHoraCodarJava.EstruturaRepeticao;

public class EstruturaWhile {
    public static void main(String[] args) {
        // DECLARAÇÃO E INICIALIZAÇÃO DA VARIÁVEL DE CONTROLE, SEM ISSO NAO VAI
        int contador=0;
        while(contador <=10){
            System.out.println("O valor do contador é: " + contador);
            // INCREMENTO DA VARIÁVEL DE CONTROLE, SEM ISSO VAI GERAR LOOP INFINITO
            contador++;

        }
        // EXEMPLO DE USO DO WHILE PARA LER UMA SENHA
        String senhaDigitada = "1234";
        String senhaCorreta = "abcd";
        while(!senhaDigitada.equals(senhaCorreta)){
            System.out.println("Senha incorreta! Tente novamente.");
            // SIMULAÇÃO DE NOVA DIGITAÇÃO DA SENHA
            senhaDigitada = "abcd"; // ALTERE PARA TESTAR

        }
        System.out.println("Senha correta! Acesso concedido.");

        // LETRAS MINUSCULAS COM WHILE
        char c = 'A';
        while (c <= 'F') {
            System.out.println(c);
           c++;
        }
        // CADASTRO
        




        
    }


}
/**
 * Quando usar while na prática
   Leitura de dados até uma condição ser atendida
   Menus que ficam ativos até o usuário sair
   Processos que dependem de evento ou validação
 * 
 * 
 */
