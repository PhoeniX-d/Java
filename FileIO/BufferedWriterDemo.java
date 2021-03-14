import java.io.*;
class BufferedWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.write("urga\nSoft");;
        bw.newLine();
        char ch[] = {'a', 'b', 'c'};
        bw.write(ch);
        bw.newLine();
        bw.flush();
        bw.close(); // internally fw also will be close
    }    
}
