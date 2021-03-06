class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Parent..." + Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child..." + Thread.currentThread().getName());
        }
    }
}
