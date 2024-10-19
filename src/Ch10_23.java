//寫法三
class OuterClass {
    int i = 10;

    void display() {
        class InnerClass {
            int printInfo() {
                System.out.println("我在內部class");
                return i;
            }
        }
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.printInfo());
    }
}

public class Ch10_23 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
