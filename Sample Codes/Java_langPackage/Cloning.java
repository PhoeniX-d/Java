class Test implements Cloneable
{
    int i = 10;
    int j = 20;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Test t1 = new Test();
        Test t2 = (Test)t1.clone();
        System.out.println("t1\t:" + t1.i + "..." + t1.j);
        t2.i = 999;
        t2.j = 888;
        System.out.println("t1\t:" + t1.i + "..." + t1.j);
        System.out.println("t2\t:" + t2.i + "..." + t2.j);
    }
}
