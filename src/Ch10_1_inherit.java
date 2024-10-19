//繼承 extends
class Lion extends Animal {
    //初始化
    Lion(String name) {
        //在 Lion 的构造函数中，通过 super(name) 调用父类的构造函数，这是必须的，因为 Animal 类的构造函数需要一个参数 name。
        super(name); // 调用父类的构造方法
        System.out.println("執行Lion的建構方法");
    }
//繼承自Animal所以不用寫了
//    void eating() {
//        System.out.println(name + "吃飯");
//    }
//
//    void sleeping() {
//        System.out.println(name + "睡覺");
//    }

    void barking() {
        System.out.println(name + "吠");
    }

}

public class Ch10_1_inherit {
    public static void main(String[] args) {
        Lion lion = new Lion("Ken");
        lion.eating();
        lion.sleeping();
        lion.barking();
    }
}
