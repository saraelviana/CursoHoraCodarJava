package CursoHoraCodarJava.EstruturaRepeticao;

public class EstruturaNestedLoop {
    public static void main(String[] args) {
        for (int x=1; x<=3;x++){
            System.out.println("X EXTERNO - Linha: " + x);

            for(int y=1;y<=3;y++){
                System.out.println(x+"x"+y+"="+(x*y));
            }
        }
        
    }
    /**
     * resposta
     * 1x1=1
    1x2=2
    1x3=3
    X EXTERNO - Linha: 2
    2x1=2
    2x2=4
    2x3=6
    X EXTERNO - Linha: 3
    3x1=3
    3x2=6
    3x3=9
     */
}
