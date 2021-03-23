public class FinalizeDemo2
{
    public static void main(String[] args)
    {
        //String s = new String("August");
        FinalizeDemo2 s = new FinalizeDemo2();
        s.finalize();
        s.finalize();
        s = null;
        System.gc()    ;
        System.out.println("End of main()");
    }
    public void finalize()
    {
        System.out.println("finalize() called");
    }
}
