import java.util.InputMismatchException;
import java.util.Scanner;

//Ch13的另一種寫法
public class Ch13_7 {
    public static void div(int x, int y) throws ArithmeticException, InputMismatchException {   //不能計算時會丟出
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        int[][] iArray = {{10, 2}, {10, 1}, {10, 0}, {5, 5}};
        for (int i = 0; i < iArray.length; i++) {
            try {
                div(iArray[i][0], iArray[i][1]);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
