package pack3;
import pack2.A;
class B extends A 
{
    public static void main(String[] args) 
    {
        A a = new A();      
        //a.m1();       /* Only child reference is allowed */
        
        B b = new B();
        b.m1();

        A a1 = new B();    
       // a1.m1();      /* Only child reference is allowed */
    }    
}
