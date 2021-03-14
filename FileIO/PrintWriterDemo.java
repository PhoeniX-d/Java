import java.io.*;
class PrintWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.print(100);
        pw.print("urga\nSoft");;
        pw.println();
        pw.print(true);
        pw.println();
        pw.flush();
        pw.close(); // internally fw also will be close
    }    
}
