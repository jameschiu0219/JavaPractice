class TaiwanBank {
    //特性aka屬性、欄位
    int account;
    int balance;

    //行為aka方法
    boolean saveMoney(int save) {
        if (save > 0) {
            balance += save;
            return true;
        } else
            return false;
    }

    boolean withdrawMoney(int drawMoney) {
        try {
            if (drawMoney < balance) {
                balance -= drawMoney;
                return true;
            } else {
                System.out.println("餘額不足");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    void printInfo() {
        System.out.println("帳戶名稱:" + account + "\n" + "帳戶餘額:" + balance);
    }

}

public class Ch6 {
    public static void main(String[] args) {
        TaiwanBank taiwanBank = new TaiwanBank();  //初始化類別，在heap裡開空間後才能用裡面的物件
        taiwanBank.account = 100001;
        taiwanBank.balance = 0;

        taiwanBank.printInfo();
        System.out.println("存款" + ((taiwanBank.saveMoney(1000)) ? "成功" : "失敗"));
        taiwanBank.printInfo();
        System.out.println("提款" + ((taiwanBank.withdrawMoney(500)) ? "成功" : "失敗"));
        taiwanBank.printInfo();

    }
}

