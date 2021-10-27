interface Java9Interf{
    public static void m1(){
        m3();
    }

    public static void m2(){
        m3();
    }

    private static void m3(){
        System.out.println("Common functionality of methods m1 and m2");
    }
}
public class PrivateMethods2 implements Java9Interf{
    public static void main(String[] args) {
        Java9Interf.m1();
        Java9Interf.m2();
    }
}
