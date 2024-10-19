public class Ch8_1 {
    public static void main(String[] args) {
        //Math.random()*(區間上下限+1)+區間下限
        System.out.println("1-6之間的隨機數" + (Math.random() * (6 - 1 + 1) + 1));
        System.out.println("1-6之間的隨機整數" + ((int) Math.floor(Math.random() * (6 - 1 + 1)) + 1));
    }
}
