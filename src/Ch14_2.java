//基本介面繼承
interface Drink {
    void printInfo();
}

interface Human extends Drink {
    void HumanDrink();
}

interface Dog extends Drink {
    void DogDrink();
}

interface friends extends Dog, Human {
    //可同時繼承2個介面
}

class D1 implements Dog {
    //實作繼承介面
    public void DogDrink() {
        System.out.println("來自子介面Dog的方法");
    }

    public void printInfo() {
        System.out.println("來自父介面Drink的方法");
    }
}

class D2_1 implements Human, Dog {
    //可多重實作
    @Override
    public void DogDrink() {

    }

    @Override
    public void HumanDrink() {

    }

    @Override
    public void printInfo() {

    }
}

public class Ch14_2 {
    public static void main(String[] args) {
        D1 d1 = new D1();
        D2_1 d2 = new D2_1();
        d1.DogDrink();
        d1.printInfo();
    }
}
