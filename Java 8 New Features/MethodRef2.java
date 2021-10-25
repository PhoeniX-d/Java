interface Inter{
    public void m1(int i);
}
public class MethodRef2{
    public void m2(int i){
        System.out.println("From Method Reference: " + i);
    } 
    
    public static void main(String[] args) {
        Inter f1 = i->System.out.println("From Lambda Expression: " + i);
        f1.m1(50);
        MethodRef2 m = new MethodRef2();
        Inter f2 = m::m2; 
        f2.m1(100); // Inter m1() refers to MethodRef2 instance method m2()
    }
}
