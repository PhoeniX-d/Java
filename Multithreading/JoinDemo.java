class JoinDemo 
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t = new MyThread();
        t.start();
        t.join(1);
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }        
    }    
}

class MyThread extends Thread 
{
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }        
    }    
}