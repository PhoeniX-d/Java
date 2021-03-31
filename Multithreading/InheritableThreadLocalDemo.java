class InheritableThreadLocalDemo {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}

class ChildThread extends Thread {
    public void run()
    {
        System.out.println("Child Thread Value:\t" + ParentThread.itl.get());
    }
}

class ParentThread extends Thread {
    public static InheritableThreadLocal itl = new InheritableThreadLocal()
    {
        protected Object childValue(Object p)
        {
            return "cc";
        }
    };

    public void run()
    {
        itl.set("pp");
        System.out.println("Parent Thread Value:\t" + itl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }

}