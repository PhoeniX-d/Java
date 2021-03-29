class ThreadGroupDemo4
{
    public static void main(String[] args)
    {
        ThreadGroup sg = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[sg.activeCount()];
        sg.enumerate(t);
        for(Thread t1 : t)
        {
            System.out.println(t1.getName() + "->[IsDaemon]" + t1.isDaemon());
        }
    }    
}
