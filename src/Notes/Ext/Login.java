package Notes.Ext;

public class Login {
    public static void main(String[] args){
        float key= 1311;
        float keyUser = 1311;
       // boolean validateKey= keyUser == key;
        String user= "Alexis";
        String userUser= "Alexis";
       // boolean ValidateUser = userUser .equals(user);
       // boolean ValidateCredentials = validateKey && ValidateUser;
        if (keyUser == key  && userUser.equals(user) ){
                    System.out.println("Bienvenido "+ userUser);
                }else {
                    System.out.println("Usuario o contraseña incorrecta");
                }



    }
}
