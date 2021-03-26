class JoinDemo1 
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t = new MyThread();
        t.start();
        //t.join();
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
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }        
    }    
}