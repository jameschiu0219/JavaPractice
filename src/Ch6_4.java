class Swap {
    int x,y;
}

public class Ch6_4 {
    public static void swapFunction(Swap S) {
        int temp=S.x;
        S.x=S.y;
        S.y=temp;

        System.out.println("swap內 x="+S.x);
        System.out.println("swap內 y="+S.y);
    }
    public static void main(String[] args) {
        Swap swap=new Swap();
        swap.x=10;
        swap.y=15;
        System.out.println("Before x="+swap.x);
        System.out.println("Before y="+swap.y);

        swapFunction(swap); //如果call by value。x跟y只在function內交換，但是原本變數不變，需要變數接住才會成立，所以要用class或array帶比較方便

        System.out.println("After x="+swap.x);
        System.out.println("After y="+swap.y);


    }
}
