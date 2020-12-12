class Demo
{
    public int i;

    public Demo()
    {
        System.out.println("Base Default");
        this.i = 100;
    }

    public Demo(int no)
    {
        this();
        System.out.println("Base Parameterized");
        this.i = no;
    }

    public void fun()
    {
        System.out.println("Inside fun()");
        System.out.println("this.i = \t" + this.i);
    }
}

class Inheritance
{
    public static void main(String[] args) {
        Demo dObj = new Demo();
        dObj.fun();
        Demo dObj2 = new Demo(190);
        dObj2.fun();
    }
}
