public class FinalizeDemo5
{
    static int cnt = 0;
    public static void main(String[] args) throws InterruptedException
    {
        for(int i = 0; i < 1000000; i++)
        {
            FinalizeDemo5 f = new FinalizeDemo5();
            f = null;
        }
    }
    public void finalize()
    {
        System.out.println("finalize() called\t:" + (++cnt));
    }
}
