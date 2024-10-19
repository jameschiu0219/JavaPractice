interface A2 {
    void walking();

    default void running() {
        System.out.println("1");
    }
}

interface B2 extends A2 {
    default void running() {
        System.out.println("2");
    }
}

interface C2 extends A2 {
    default void running() {
        System.out.println("3");
    }
}

class D2 implements B2, C2 {
    public void running() {
        System.out.println("4");
    }

    public void walking() {
        B2.super.running();
        C2.super.running();
    }
}

public class Ch14_14 {
    public static void main(String[] args) {
        D2 d = new D2();
        System.out.println("--");
        d.running();
        System.out.println("--");
        d.walking();
    }

}
