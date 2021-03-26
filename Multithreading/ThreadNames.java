class ThreadNames {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Pranav");
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread
{

}
