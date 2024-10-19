class lotto {
    int r = 0;
    int[] results = new int[6];

    void results() {
        for (int i = 0; i < 6; i++) {
            while (true) {
                r = (int) (Math.random() * (42 - 1 + 1)) + 1; // 生成 1 到 42 之間的隨機數
                if (!contains(results, r)) { // 如果 r 不在 results 中
                    results[i] = r; // 将 r 添加到陣列中
                    break; // 跳出while循環，走下一個for迴圈
                }
            }
        }
        System.out.println("中獎號碼:");
        for (int j : results) {
            System.out.printf("%d ", j);
        }
        ;
    }

    boolean contains(int[] arr, int key) {
        for (int n : arr) {
            if (n == key) {
                return true;    //!contains(results, r)結果為false，所以不會執行迴圈
            }
        }
        return false;           //!contains(results, r)結果為true，所以會執行迴圈，添加r
    }
}

public class Ch8_2_lotto {
    public static void main(String[] args) {
        lotto lotto = new lotto();
        lotto.results();
    }

}
