interface Logging{
    // Abstract methods
    default void logInfo(String msg){
        commonInfo(msg);
    }
    default void logWarn(String msg){
        commonInfo(msg);
    }
    private void commonInfo(String msg){
        System.out.println("Common methods to both methods with msg : " + msg);
    }
}
public class PrivateMethods1 implements Logging{
    public static void main(String[] args) {
        Logging l = new PrivateMethods1();
        l.logInfo("INFO");
        l.logWarn("WARNING!");
    }
}
