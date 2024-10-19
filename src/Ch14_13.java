interface A1 {
    void walking();

    default void running() {
        System.out.println("1");
    }
}

interface B1 extends A1 {
    void walking();

    default void running() {
        System.out.println("2");
    }
}

class C1 implements B1 {
    public void walking() {
        System.out.println("3");
    }
}


public class Ch14_13 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.running();
        c1.walking();
    }
}
