package Notes;

public class OperadorLogico {

    public static void main(String[] args){
        //Operadores logicos &&, ||, !

        int key= 3030;
        int keyUser = 3030;
        boolean validateKey= keyUser == key;

        String user= "Juan";
        String userUser= "Juan";

        boolean ValidateUser = userUser .equals(user);
        boolean ValidateCredentials = validateKey && ValidateUser;
        System.out.println("inicia Sesion  " + ValidateCredentials);

    }


}
