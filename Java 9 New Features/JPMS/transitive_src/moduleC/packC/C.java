package packC;
import packB.B;
public class C {
   public static void main(String[] args) {
       System.out.println("C class main method");
       B b = new B();
       b.m2().m1();
   }
}
