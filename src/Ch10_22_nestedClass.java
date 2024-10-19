////寫法一
////class OuterClass {
////    private class InnerClass {
////        void printInfo() {
////            System.out.println("我在內部class");
////        }
////    }
////
////    void display() {
////        //因為有private，所以只能透過同個class(OuterClass)來呼叫，在main是叫不到的
////        InnerClass innerClass = new InnerClass();
////        innerClass.printInfo();
////        System.out.println("我在外部class");
////    }
////}
//
////寫法二
//class OuterClass {
//    class InnerClass {
//        void printInfo() {
//            System.out.println("我在內部class");
//        }
//    }
//}
//
//
//public class Ch10_22_nestedClass {
//    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//
//        //寫法一
//        //outerClass.display();
//        //o.printInfo(); 叫不到
//
//        //寫法二
//        OuterClass.InnerClass i = outerClass.new InnerClass();
//        i.printInfo();
//    }
//}
