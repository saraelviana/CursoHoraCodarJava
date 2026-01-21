package CursoHoraCodarJava.EstruturaRepeticao;

public class EstruturaContLoop {
    public static void main(String[] args) {
        for (int i=10; i>0; i--){
            if (i%2 == 0) {
                System.out.println(i);
                continue;
                
            }
            System.out.println("o contador e : "+i);
        }
        
    }

}
