class ThreadGroupDemo
{
    public static void main(String[] args)
    {
        ThreadGroup tg = new ThreadGroup("tg");
        Thread t1 = new Thread(tg, "First");
        Thread t2 = new Thread(tg, "Second");
        tg.setMaxPriority(3);
        Thread t3 = new Thread(tg, "Third");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }    
}
