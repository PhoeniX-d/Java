class A
{
    class B
    {
        class C
        {
            public void m1()
            {
                System.out.println("Innermost inner class method");
            }
        }
    }
    public static void main(String[] args)
    {
        new A().new B().new C().m1();
    }
}
