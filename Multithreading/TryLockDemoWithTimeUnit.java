import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class TryLockDemoWithTimeUnit
{
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread("First Thread");
        MyThread t2 = new MyThread("Second Thread");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread 
{
    static ReentrantLock l = new ReentrantLock();

    MyThread(String name)
    {
        super(name);
    }
    
    public void run()
    {
        do
        {
            try {
                if(l.tryLock(2000, TimeUnit.MILLISECONDS))
                {
                    System.out.println(Thread.currentThread().getName() + " got lock");                    
                    Thread.sleep(10000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + " released lock"); 
                    break;                   
                }
                else
                {
                    System.out.println(Thread.currentThread().getName() + " unable to get lock trying again");
                }
            }
            catch(InterruptedException e){}
        }while(true);
    }
}
