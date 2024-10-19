class BigMath {
    //可變參數設計(不推薦用) int...y
    int add(int x, int...y) {
        int total = x;
        for (int num : y) {
            total += num;
        }
        return total;
    }
}

public class Ch6_7 {
    public static void main(String[] args) {
        BigMath bigMath = new BigMath();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(bigMath.add(values[0], 2,3,5));
    }
}
