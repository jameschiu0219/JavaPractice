class Student {
    private int age;
    String name;

    //constructor建構方法(自動初始化)
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    void printInfo(){
        System.out.println(name+","+age);
    }
}

public class Ch7_10 {
    public static void main(String[] args) {
        Student student=new Student(18,"Jane");
        /*
        因為private的關係，只能在class裡使用，不能在main直接設定age，只能呼叫同class裡的方法
        student.age=100;
        */
        student=new Student(22,"Marry");
        student.printInfo();

    }
}
