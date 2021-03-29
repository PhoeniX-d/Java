class ThreadA
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b)
        {
            System.out.println("Main Thread Calls wait()");
            b.wait();
            System.out.println("Main Got Notification");
            System.out.println(b.total);
        }
    }
}

class ThreadB  extends Thread
{
    int total = 0;

    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Thread Started Calculation");
            for (int i = 0; i <= 100; i++)
            {
                total = total + i;
            }
            System.out.println("Child Thread Calls notify()");
            this.notify();

        }
    }    
}
