import java.util.*;

public class Ch16 {
    public static void main(String[] args) {
        //泛型-ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.add("Tokyo");
        al.add("Taipei");
//        ArrayList<String> al2=new ArrayList<>();
//        al2.add("Osaka");
//        al2.add("Tainan");
//        al.addAll(al2);     //陣列相加
//        System.out.println(al);
//        System.out.println(al.size());//陣列長度

        //泛型-LinkedList
        LinkedList<String> ll = new LinkedList<>();
        //泛型-Hashset
        HashSet<String> hs = new HashSet<>();
        //HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        //迭代器
        Iterator<String> it = al.iterator();
        //輸出第一個元素
        //System.out.println("輸出第一個元素:" + it.next());

        //輸出集合中的所有元素
        while (it.hasNext()) {
            //hasnext()->迭代內若有元素會回傳true
            String str = it.next();
            if (str.equals("Taipei"))
                it.remove();
            System.out.println(it.next());
        }
    }
}
