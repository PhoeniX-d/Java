public class ProcessBuilderDemo2 {
    public static void main(String[] args) throws Exception{
        ProcessBuilder builder = new ProcessBuilder("java", "FrameDemo.java", args[0]);
        builder.start();
    }    
}
