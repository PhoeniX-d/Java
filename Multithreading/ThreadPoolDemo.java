import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolDemo {
    public static void main(String[] args) {
        Printjob[] jobs = { new Printjob("durga"), 
        new Printjob("ravi"), 
        new Printjob("shiva"), 
        new Printjob("pawan"),
        new Printjob("anil"), 
        new Printjob("suresh")};
        ExecutorService service = Executors.newFixedThreadPool(1);
        for(Printjob job : jobs)
        {
            service.submit(job);
        }
        service.shutdown();
    }
}

class Printjob implements Runnable
{
    String name;

    Printjob(String name)
    {
        this.name = name;
    }

    public void run()
    {
        System.out.println(name + " job started by thread " + Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
        }System.out.println(name + " job completed by thread " + Thread.currentThread().getName());
    }
}