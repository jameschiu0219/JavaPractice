//守護執行緒 (Daemon thread):存在於後台
public class Ch15_4 {
    public static void main(String[] args) {
        CarRacing Volvo = new CarRacing("Volvo");
        CarRacing Nissan = new CarRacing("Nissan");
        //匿名類別
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Volvo.run(10);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Nissan.run(10);
            }
        };
        t1.start();
        t2.start();

        //也可以這樣寫
        new Thread() {
            @Override
            public void run() {
                Nissan.run(5);
            }
        }.start();
    }
}
