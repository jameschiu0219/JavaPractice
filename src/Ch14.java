import java.util.Scanner;

//介面
interface Shape {
    double Pi = 3.14; //public static final，其他人能用是因為static

    double area();  //預設public abstract
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {  //implement是public，所以這邊要記得寫public
        return Pi * r * r;
    }
}

class Triangle implements Shape {
    double height, width;

    Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}

public class Ch14 {
//    public static double input() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public static void main(String[] args) {
//        input();
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 8);
        System.out.println("圓面積" + circle.area());
//        input();
        System.out.println("長方形面積" + triangle.area());
        System.out.println("Shape裡的Pi可以直接讀:" + Shape.Pi);
        System.out.println("圓的Pi可以讀是因為static:" + circle.Pi);
    }
}
