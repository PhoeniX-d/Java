class SynchronizedDemo2
{
    public static void main(String[] args)
    {
       /* Display d = new Display();
        MyThreadA t1 = new MyThreadA(d);
        MyThreadB t2 = new MyThreadB(d);*/
        Display d1 = new Display();
        Display d2 = new Display();
        MyThreadA t1 = new MyThreadA(d1);
        MyThreadB t2 = new MyThreadB(d2);
        t1.start();
        t2.start();
    }
}

class Display {
   
    public static synchronized void displayn() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public synchronized void displayc() {
        for (int i = 65; i < 75; i++) {
            System.out.print((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyThreadA extends Thread {
    Display d;
    MyThreadA(Display d) {
        this.d = d;
    }
    public void run() {
        d.displayn();
    }
}

class MyThreadB extends Thread {
    Display d;
    MyThreadB(Display d) {
        this.d = d;
    }
    public void run() {
        d.displayc();
    }
}
