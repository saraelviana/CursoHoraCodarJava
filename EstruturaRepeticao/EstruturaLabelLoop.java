package CursoHoraCodarJava.EstruturaRepeticao;

public class EstruturaLabelLoop {
    public static void main(String[] args) {
        externo: //rotulo
        for (int i = 0; i < 5; i++) {
            interno: //rotulo
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) { // CHECANDO LOOP INTERNO E EXTERNO

                    //break; //interrompe o loop mais interno
                    //break interno; //interrompe o loop com o rotulo especificado
                    break externo; //interrompe o loop com o rotulo especificado
                }
                System.out.println("i: " + i + " j: " + j);
           }
        }
               
    }
    
}
/**
 * posso ter rotulos internos e externos
 * 
 */
