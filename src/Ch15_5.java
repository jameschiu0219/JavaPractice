class HuananBank {
    int balance = 0;

    public synchronized void withdraw(int money) {
        try {
            if (balance - money < 0) {
                System.out.println("餘額不足");
                wait();
            } else {
                balance -= money;
                System.out.println("已提款" + money + "，剩餘" + balance);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public synchronized void save(int money) {
        System.out.println("");
        balance += money;
        System.out.println("已存款" + money + "，存款餘額" + balance);
        notify();   //通知wait部分可以繼續做
    }
}

public class Ch15_5 {
    public static void main(String[] args) {
        HuananBank huananBank = new HuananBank();
        //存錢
        new Thread() {
            @Override
            public void run() {
                huananBank.withdraw(5000);
            }
        }.start();
        //領錢
        new Thread() {
            @Override
            public void run() {
                huananBank.save(1000);
            }
        }.start();
    }
}
