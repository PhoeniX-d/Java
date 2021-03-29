class DeadlockDemo extends Thread
{
    A a = new A();
    B b = new B();

    public void m1()
    {
        this.start();
        a.d1(b);
    }

    public void run()
    {
        b.d2(a);
    }
    public static void main(String[] args) 
    {
        DeadlockDemo dead = new DeadlockDemo();
        dead.m1();
    }
}

class A {
    public synchronized void d1(B b) {
        System.out.println("Thread 1 stared execution of d1()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread 1 trying to call B's last()");
        b.last();

    }

    public synchronized void last() {
        System.out.println("Inside A's last()");
    }
}

class B {
    public synchronized void d2(A a) {
        System.out.println("Thread 2 stared execution of d2()");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread 2 trying to call A's last()");
        a.last();

    }

    public synchronized void last() {
        System.out.println("Inside B's last()");
    }
}
