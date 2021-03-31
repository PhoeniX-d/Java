public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        CustomerThread c1 = new CustomerThread("Customer T - 1");
        CustomerThread c2 = new CustomerThread("Customer T - 2");
        CustomerThread c3 = new CustomerThread("Customer T - 3");
        c1.start();
        c2.start();
        c3.start();
    }
}

class CustomerThread extends Thread 
{
    static Integer custId = 0;
    private static ThreadLocal<Integer> t = new ThreadLocal<Integer>(){
                    protected Integer initialValue()
                    {
                        return ++custId;
                    }
    };

    CustomerThread(String s)
    {
        super(s);
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " excecuting with customer id = " + t.get());
    }
}
