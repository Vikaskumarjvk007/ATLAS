class OuterClass019 {
    int x = 10;
    static class InnerClass {
        static int y = 5;
    }
}

public class Main019 {
    public static void main(String[] args) {
        OuterClass019.InnerClass myInner = new OuterClass019.InnerClass();
        System.out.println(myInner.y);
    }
}
