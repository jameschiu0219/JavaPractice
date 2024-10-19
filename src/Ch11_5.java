abstract class User{
    String name;
    int ID;
    String address;
    abstract void Dashboard();
    void login(){
        System.out.println("Login:");
    };
}
class Admin extends User{
    @Override
    void Dashboard(){
        System.out.println("Admin's Dashboard");
    }
}
class Guest extends User{
    @Override
    void Dashboard(){
        System.out.println("Guest's Dashboard");
    }
}
public class Ch11_5 {
    public static void main(String[] args) {

    }
}
