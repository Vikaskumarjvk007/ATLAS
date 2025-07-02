class OuterClass018 {
    int x = 50;
    class InnerClass {
        public int innerMethod() {
            return x;
        }
    }
}

public class DriverClass018 {
    public static void main(String[] args) {
        OuterClass018 myOuter = new OuterClass018();
        OuterClass018.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.innerMethod());
    }
}
