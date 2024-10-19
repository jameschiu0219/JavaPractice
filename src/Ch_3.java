import java.util.Scanner;

public class Ch_3 {
    public static void main(String[] args) {
//        int age;
//        Scanner scanner = new Scanner(System.in);    //輸入
//        System.out.println("請輸入年齡:");
//        age = scanner.nextInt();
//        if (age < 18) System.out.println("不可以瑟瑟");  //如果敘述只有一行{}可以拿掉
//        else {
//            System.out.println("可以瑟瑟");
//        }
//        int score;
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("請輸入成績:");
//        score = scanner1.nextInt();
//        switch (score / 10) {        //這個邏輯背起來
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("F");
//                break;

//        }
        //BMI計算
//        float height, weight, BMI;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入身高(cm):");
//        height = scanner.nextFloat() / 100;
//        System.out.println("請輸入體重(kg):");
//        weight = scanner.nextFloat();
//
//        BMI = weight / (height * height);
//        if (BMI > 30) {
//            System.out.println("體重過重");
//        } else if (BMI < 15) {
//            System.out.println("體重過輕");
//        } else {
//            System.out.println("體重正常");
//        }
        //判斷奇偶數
//        float num;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入任意整數:");
//        num = scanner.nextFloat();
//        if (num != 0) {
//            if (num % 2 == 0) {
//                System.out.println("輸入的是偶數");
//            } else {
//                System.out.println("輸入的是奇數");
//            }
//        } else {
//            System.out.println("輸入的是0");
//        }
        int ans = 55;
        int Try = 0;
        int pwd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入2位數密碼:");
        pwd = scanner.nextInt();
        while (pwd != ans) {
            Try += 1;
            if (Try == 5) {
                System.out.println("錯誤次數達上限，請聯絡銀行^^");
                break;
            }
            System.out.println("密碼輸入錯誤，還剩" + (5 - Try) + "次:");
            System.out.println("請輸入2位數密碼:");
            pwd = scanner.nextInt();

        }
        System.out.println("密碼正確");
    }
}
