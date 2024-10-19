public class Ch5_4 {
    public static void main(String[] args) {
        int[] num = {10, 30, 20};
        int[] num2 = num;
        System.out.println("num=" + num[1]);
        System.out.println("num2=" + num2[1]);
        System.out.println("num2[1]改值後");
        num2[1] = 50;
        System.out.println("num=" + num[1]);
        System.out.println("num2=" + num[1]);
    }
}
