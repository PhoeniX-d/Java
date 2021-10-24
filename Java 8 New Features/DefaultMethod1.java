interface Interface1{
    default void m1(){
        System.out.println("Default Method");
    }
}

class Test implements Interface1{
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
