class Test
{
    int x = 10;
    static int y = 20;
    public void m1()
    {
        final int k = 1890;
        class Inner
        {
            public void m2()
            {
                System.out.println(x);
                System.out.println(k);
                System.out.println(y);
            }
        }
        Inner i = new Inner();
        //k = 1000;
        i.m2();
    }

    public static void main(String[] args) 
    {
        Test t = new Test();
        t.m1();    
    }
}
