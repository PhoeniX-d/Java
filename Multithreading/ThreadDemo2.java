class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.run(5);
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
        for (int i = 0; i < 10; i++) {
            System.out.println("Child..." + Thread.currentThread().getName());
        }
    }
    
    public void run(int i)
    {
        while(i >= 0)
        {
            System.out.println("run..." + Thread.currentThread().getName());
            i--;
        }
    }
}
