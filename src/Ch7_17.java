class Member {
    static String name;    //所有物件共享一份資料
    String level;   //每個物件有自己一份資料

    static {
        //{}為初始區塊
        //有static->正常情況下資料存在static記憶體內，跟物件無關
        //這邊的情況會存在物件的記憶體內
        name = "Bunny";
    }

    Member(String level) {
        this.level = level;
    }

    void printInfo() {
        System.out.println("使用者名稱:" + this.name);
        System.out.println("level:" + this.level);

    }

}

public class Ch7_17 {
    public static void main(String[] args) {

        Member m1 = new Member("Gold");
        Member m2 = new Member("Silver");

        m1.printInfo();
        m2.printInfo();


    }
}
