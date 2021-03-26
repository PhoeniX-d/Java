class ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        MyThread t = new MyThread();
        System.out.println(Thread.currentThread().getName() + " = " + Thread.currentThread().getPriority());
        System.out.println(t.getName() + " = " + t.getPriority());
    }
}

class MyThread extends Thread
{

}
