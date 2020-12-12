class Base {
    public int i;

    /*
    public Base()
    {
        System.out.println("Base Default");
        this.i = 100;
    }
    */
    public Base(int no) {
        //this();
        System.out.println("Base Parameterized");
        this.i = no;
    }

    public void fun() {
        System.out.println("Inside fun()");
        System.out.println("this.i = \t" + this.i);
    }
}

class Derived extends Base 
{
    public int j;

    public Derived()
    {
        super(111);
        System.out.println("Derived Default");
        this.j = 4354;
    }

    public void gun() {
        System.out.println("Inside gun()");
        System.out.println("this.j = \t" + this.j);
        System.out.println("super.i = \t" + super.i);
    }
}
class JavaSuper
{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
        d.gun();
    }
}
