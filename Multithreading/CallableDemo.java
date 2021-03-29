import java.util.concurrent.*;

class CallableDemo {
    public static void main(String[] args) throws Exception{
        MyCallable jobs[] = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
                new MyCallable(50), new MyCallable(60)};
        
            ExecutorService service = Executors.newFixedThreadPool(3);
             for(MyCallable job : jobs)
            {
                Future r = service.submit(job);
                System.out.println(r.get());
            }
            service.shutdown();
    }
}

class MyCallable implements Callable
{
    int num;

    MyCallable(int num)
    {
        this.num = num;
    }

    public Object call() throws Exception 
    {
        int sum = 0;
        System.out.println(Thread.currentThread().getName() + " responsible to find sum of first " + num + " numbers");
        for (int i = 0; i <= num; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
