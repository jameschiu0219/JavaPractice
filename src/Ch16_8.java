//Lambda:主要應用在functional interface(介面只有一方法)上
//(參數)->{運算內容}

@FunctionalInterface
interface Calculator {
    int add(int x, int y);
}

public class Ch16_8 {
    public static void main(String[] args) {
        //方法一
        //Calculator c = (x, y) -> x + y;
        //方法二
        //Calculator c = (x, y) -> {return x + y;};
        //
        Calculator c = (x, y) -> (x + y);

        System.out.println(c.add(1, 2));
        //
    }
}
