class shadowName {
    int i = 10;

    void printInfo(int i) {
        System.out.println("區域變數:" + i);
        //名稱遮罩:區域變數會遮住原本這個類別的i，所以用this代表這個類別
        System.out.println("成員屬性:" + this.i);
    }
}

public class Ch6_10 {
    public static void main(String[] args) {
        shadowName shadowName = new shadowName();
        shadowName.printInfo(30);
    }
}
