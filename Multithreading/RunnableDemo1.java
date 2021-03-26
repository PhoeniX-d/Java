class RunnableDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
