class OuterClass {
    int x = 50;

    class InnerClass {
        int y = 5;
        
        public int innerMethod() {
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Inner method returns: " + myInner.innerMethod());
    }
}
