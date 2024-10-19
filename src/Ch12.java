
public class Ch12 {
    public static void main(String[] args) {
        //封箱
        int x=5;
        Integer IObj=x;     //Integer是wrapper，是一個物件
        System.out.println("");

        //拆箱
        Integer y=100;
        y+=10;
        System.out.println(y);
    }
}
