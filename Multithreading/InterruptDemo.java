class InterruptDemo
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of main");
    }      
}

class MyThread extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("I am Lazy");
        }
        System.out.println("I want to go to sleep");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("I got Interrupted");
        }
    }
}
