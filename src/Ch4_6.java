public class Ch4_6 {
    public static void main(String[] args) {
        int i, j;
        //置左
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("*");
                if (j == i) {
                    System.out.println("");
                }
            }
        }
        //置右
//        自己寫得有夠醜XD
//        for (i = 1; i <= 10; i++) {
//            for (j = 10; j >= i; j--) {
//                System.out.printf(" ");
//                if (j == i) {
//                    System.out.printf("*".repeat(j));
//                    System.out.println("");
//                }
//            }
//        }
        for (i = 1; i <= 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.printf(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        //置中
        //邏輯:
        //先打印空格，通过控制空格数量让星号居中。
        //然后打印星号，这里星号的数量是2 * i - 1。
        //自己寫的有夠醜XD
//        for (i = 1; i <= 9; i++) {
//            for (j = 10; j / 2 >= i; j--) {
//                if (j % 2 == 0) {
//                    System.out.printf(" ");
//                    if (j / 2 == i) {
//                        if(i==1){
//                            System.out.printf("*".repeat(i));
//                            System.out.printf(" ".repeat(j / 2));
//                            System.out.println("");
//                        }
//                        else{
//                        System.out.printf("*".repeat(j-1));
//                        System.out.printf(" ".repeat(j / 2));
//                        System.out.println("");
//                        }
//                    }
//
//                }
//            }
//        }

        for (i = 1; i <= 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.printf(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        //漏斗
        for (i = 10; i >= 1; i--) {
            for (j = 0; j < 10 - i; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*".repeat(2*i-1));
            System.out.println();
        }
    }
}
