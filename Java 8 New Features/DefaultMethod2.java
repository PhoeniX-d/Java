interface Left{
    default void m1(){
        System.out.println("Left Default Method");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right Default Method");
    }
}

class Test implements Left, Right{

    public void m1(){
        Left.super.m1(); // To call m1() from Left interface
        Right.super.m1();   // To call m1() from Right interface
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
