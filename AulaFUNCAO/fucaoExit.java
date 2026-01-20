/**
 * vamos fazer a documentação do código
 * função exist
 * fuçnção que examina se a senha e compativel e se o usuário é o correto
 *@param User - nome do usuário
 *@param Senha - senha do usuário  
 *@return - sem retorno
 */



public class fucaoExit {
    public static void main(String[] args) {
        VericAutentic("adm", "senhasegura");
        System.out.println("Sistema Continua...");
        
    }
    public static void VericAutentic( String User, String Senha){
        if (! User.equals("adm") && ! Senha.equals("senhasegura")) {
            System.out.println("Acesso Negado");
            System.exit(0);
            
        }else{
            System.out.println("Acesso Permitido");
        }
    }
}
