public class FinalizeDemo4
{
    static FinalizeDemo4 f;
    public static void main(String[] args) throws InterruptedException
    {
        FinalizeDemo4 s = new FinalizeDemo4();
        System.out.println(s.hashCode());
        s = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("End of main()");
    }
    public void finalize()
    {
        System.out.println("finalize() called");
        f = this;
    }
}
