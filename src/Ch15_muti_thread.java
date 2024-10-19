//多執行緒
class CarRacing extends Thread implements Runnable {
    //Thread類別、Runnable介面已內建，不須自己寫
    String name;

    CarRacing(String name) {
        //建構方法
        this.name = name;
        //super(name);  //進階寫法
    }

    public void run(int j) {
        //Runnable唯一的方法
        for (int i = 0; i < j; i++) {
            try {
                //sleep要放在try-catch內
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name + "第" + i + "圈");
        }
    }
}

public class Ch15_muti_thread {
    public static void main(String[] args) {
        CarRacing toyota = new CarRacing("toyota");
        CarRacing BMW = new CarRacing("BMW");

//        Thread t1 = new Thread(toyota);    //thread類別已內建，只需new就能新增執行緒
//        t1.start();                  //執行緒啟動
//        Thread t2 = new Thread(BMW);
//        t2.start();
        toyota.start(); //因為extends thread，所以可以直接呼叫start，若沒有要用上面的方法

        try {
            //join要放在try-catch內
            //join會擋住其他執行緒的工作，直到此執行緒結束其他才能繼續
            toyota.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        BMW.start();
    }
}
