package packB;
import packA.A;
public class B {
   public A m2() {
       System.out.println("Method of moduleB");
       A a = new A();
       return a;
   }
}
