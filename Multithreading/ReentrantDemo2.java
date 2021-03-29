import java.util.concurrent.locks.*;
class ReentrantDemo2 
{
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        t1.start();
        t2.start();
    }    
}

class Display
{
    ReentrantLock r = new ReentrantLock();

    public void wish(String name)
    {
        r.lock();
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
        r.unlock();
    }
}

class MyThread extends Thread
{
    String name;
    Display d;

    MyThread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}
