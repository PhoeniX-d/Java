/*
Accessing Inner class code from instance area of Outer class,
*/

class Outer
{
    class Inner {
        public void m2() {
            System.out.println("Inner class method");
        }
    }
    
    public void m1()
    {
        Inner i = new Inner();
        i.m2();
    }
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.m1();
    }    
}
