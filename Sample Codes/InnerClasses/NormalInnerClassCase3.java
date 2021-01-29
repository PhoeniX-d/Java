/*
Accessing Inner class code from outside of Outer class,
*/

class Outer
{
    class Inner {
        public void m1() {
            System.out.println("Inner class method");
        }
    }
}

class Test
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
    }    
}
