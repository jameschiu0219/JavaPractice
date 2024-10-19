class Member2 {
    static int age; //所有物件共享一份資料
    String name;    //每個物件有自己一份資料
    String level;

    Member2(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("使用者名稱:" + this.name);
        System.out.println("使用者年齡:" + age);

    }

}

public class Ch7_16 {
    public static void main(String[] args) {
        //放在物件前測試
        Member2.age = 100;

        Member2 m1 = new Member2("Jane");
        Member2 m2 = new Member2("MAY");
        //m1.age=30;
        m1.printInfo();
        m2.printInfo();

        //放在物件後測試
        Member2.age = 200;
        m1.printInfo();
        m2.printInfo();

    }
}

