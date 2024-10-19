//抽象類別=模板-->不能new
//子類別對模板進行建構
abstract class Bank2 {
    int money;

    int withdraw() {
        return 0;
    }

}

class FirstBank2 extends Bank2 {
    int money;

    FirstBank2(int money) {
        this.money = money;
    }

    int withdraw() {
        return 100 * money;
    }

}

class Landbank2 extends Bank2 {
    int dollar;

    Landbank2(int dollar) {
        this.dollar = dollar;
    }

    int withdraw() {
        return 10 * dollar;
    }

}

public class Ch11 {
    public static void main(String[] args) {
        FirstBank2 firstBank2 = new FirstBank2(5);
        Landbank2 landbank2 = new Landbank2(5);
        System.out.println(firstBank2.withdraw());
        System.out.println(landbank2.withdraw());
    }
}
