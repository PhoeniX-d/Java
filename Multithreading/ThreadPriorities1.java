class ThreadPriorities1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setPriority(10);
        t.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
