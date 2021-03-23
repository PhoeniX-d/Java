public class FinalizeDemo1
{
    public static void main(String[] args)
    {
        //String s = new String("August");
        FinalizeDemo1 s = new FinalizeDemo1();
        s = null;
        System.gc()    ;
        System.out.println("End of main()");
    }
    public void finalize()
    {
        System.out.println("finalize() called");
    }
}
