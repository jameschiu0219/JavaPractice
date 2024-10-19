import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch13_8 {
    public static void inputData() throws ArithmeticException, InputMismatchException {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        try {
            i = scanner.nextInt();
            j = scanner.nextInt();
            System.out.println(i / j);
        } catch (InputMismatchException e) {
            System.out.println("輸入資料型態的錯誤:" + e);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("請輸入2個整數:");
            inputData();
        } catch (InputMismatchException e) {
            System.out.println("輸入資料型態的錯誤:" + e);
        } catch (ArithmeticException e) {
            System.out.println("除數為0的錯誤:" + e);
        }
    }
}

