package in.Interface.Finalvaribles;

interface Constants {
    int MAX_USERS = 100;  // Implicitly public, static, and final
    String APP_NAME = "Banking System";
}

public class InterfaceFinalExample {
    public static void main(String[] args) {
        System.out.println("Max Users: " + Constants.MAX_USERS);
        System.out.println("Application Name: " + Constants.APP_NAME);
        
//         Constants.MAX_USERS = 200;  // ❌ Error! Cannot modify final variable
    }
}
