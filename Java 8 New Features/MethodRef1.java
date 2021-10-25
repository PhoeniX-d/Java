public class MethodRef1 {
    public static void m1(){
        for(int i = 1; i <= 10; i++)
            System.out.println("Child Thread");
    } 
    
    public static void main(String[] args) {
        Runnable r = MethodRef1::m1; // Here Runnable run() refers to the MethodRef1 m1()
        Thread t = new Thread(r);
        t.start();
        for(int i = 1; i <= 10; i++)
            System.out.println("Main Thread");;
    }
}
