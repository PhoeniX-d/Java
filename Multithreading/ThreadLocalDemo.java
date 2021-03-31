public class ThreadLocalDemo
{
    public static void main(String[] args) {
        ThreadLocal<String> tl = new ThreadLocal<String>()
        {
            public String initialValue()
            {
                return "Abc";
            }
        };
        System.out.println(tl.get());
        tl.set("durga");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }    
}
