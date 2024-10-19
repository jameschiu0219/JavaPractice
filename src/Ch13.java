import java.util.InputMismatchException;
import java.util.Scanner;

class Div {
    public static int cal(int x, int y) {
        //例題一
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("==e的輸出1==");
            System.out.println("除數為0的錯誤:" + e);                 //等於e.toString()
            System.out.println("==e的輸出2==");
            System.out.println("除數為0的錯誤:" + e.getMessage());    //只印出錯誤訊息，不包含錯誤型態
            System.out.println("==e的輸出3==");
            e.getStackTrace();                                      //追蹤錯誤的記憶體路徑，印到log上
            return 0;
        } catch (RuntimeException e) {
            System.out.println("上面沒抓到的意外:" + e);    //習慣會這樣寫，保險
            return 0;
        } finally {
            System.out.println("finally區塊必做");
        }
        //方便擴充
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("錯誤:" + e);
//            return 0;
//        }


//        Exception exception(){
//
//        }
    }
}

public class Ch13 {
    public static void main(String[] args) {
        Div div = new Div();
        //例題一
        System.out.println(div.cal(6, 2));
        System.out.println(div.cal(6, 0));

        //例題二
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = "";
            System.out.println("請輸入2個整數:");
            try {
                System.out.println(div.cal(scanner.nextInt(), scanner.nextInt()));
            } catch (InputMismatchException e) {
                System.out.println("輸入資料型態的錯誤:" + e);
            }
            System.out.println("是否繼續嘗試? Y/N");
            str = scanner.next();

            /*
            在 Java 中，字串比較不能用 ==，因為 == 比較的是兩個物件的記憶體位址，而不是字串的內容。要比較字串的內容，應該使用 .equals() 方法。
            */
            if (str.toLowerCase().equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}
