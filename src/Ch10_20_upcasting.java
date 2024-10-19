class Bank {
    int money = 100;

    double printInfo() {
        System.out.println("利率0%");
        return 0;
    }

}

class FirstBank extends Bank {
    int money = 1000;

    @Override
    double printInfo() {
        System.out.println("利率0.5%");
        return 0.5;
    }

}

class Landbank extends Bank {
    int money = 10000;

    @Override
    double printInfo() {
        System.out.println("利率1%");
        return 1;
    }

}

public class Ch10_20_upcasting {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.printInfo();

        Bank b = new FirstBank();    //upcasting，Parent x = new Child();
        b.printInfo();
        System.out.println(b.money);    //upcasting時變數不適用，同樣名字的變數會出現父類別的值

        bank = new Landbank();//
        bank.printInfo();
    }
}
