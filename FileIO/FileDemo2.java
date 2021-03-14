import java.io.*;

class FileDemo
{
    public static void main(String[] args) throws IOException{
        
        File f = new File("xyz");
        f.mkdir();
        File f1 = new File(f, "demo.txt");
        f1.createNewFile();
    }
}