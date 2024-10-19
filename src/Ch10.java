class Animal {
    protected String name;  //protected繼承常用，private的話直接叫name會報錯


    //初始化
    Animal(String name) {
        this.name = name;
        System.out.println("執行animal的建構方法");    //父繼承會先做
    }

    void eating() {
        System.out.println("吃飯");
    }

    void sleeping() {
        System.out.println("睡覺");
    }
}

public class Ch10 {
    public static void main(String[] args) {
        Animal animal = new Animal("Rabbit");
        animal.eating();
        animal.sleeping();
    }
}
