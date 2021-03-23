public class FinalizeDemo3
{
    public static void main(String[] args)
    {
        //String s = new String("August");
        FinalizeDemo3 s = new FinalizeDemo3();
        //s.finalize();
        s = null;
        System.gc()    ;
        System.out.println("End of main()");
    }
    public void finalize()
    {
        System.out.println("finalize() called");
        System.out.print(10 / 0);
    }
}
