//原先寫法
//
//class Father {
//    protected int i = 1;
//}
//
//class Son extends Father {
//    protected int i = 2;
//}
//
//public class Ch10_2 {
//    public static void main(String[] args) {
//        Father father = new Father();
//        Son son = new Son();
//        System.out.println("父親:" + father.i);
//        System.out.println("兒子:" + son.i);
//    }
//}

class Father {
    protected int i = 1;

    void printInfo() {
        //System.out.println("父親:" + this.i);
    }
}

class Son extends Father {
    protected int i = 2;

    void printInfo() {
        System.out.println("父親:" + super.i);    //super呼叫父類別的變數
        System.out.println("兒子:" + this.i);     //this也可不寫
    }
}

public class Ch10_2 {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        father.printInfo();
        son.printInfo();

    }
}
