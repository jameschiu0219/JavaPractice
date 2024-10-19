//自定義錯誤
class MyException extends Exception {
    String str;

    MyException(String str) {
        this.str = str;
    }

    String printInfo() {
        return "自訂義錯誤";
    }
}

public class Ch13_9 {
    public static void main(String[] args) {
        try {
            System.out.println("====try====");
            throw new MyException("我是例外");            //超重要，throw出來給catch


        } catch (MyException e) {
            System.out.println("====catch====");
            e.printStackTrace();
        }
    }
}
