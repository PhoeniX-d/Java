public class ProcessBuilderDemo1 {
    public static void main(String[] args) throws Exception{
        ProcessBuilder builder = new ProcessBuilder("notepad", "ProcessInfoDemo.java");
        builder.start();
    }    
}
