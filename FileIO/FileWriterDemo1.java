import java.io.*;
class FileWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write(100);
        fw.write("urga\nSoft");;
        fw.write('\n');
        char ch[] = {'a', 'b', 'c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }    
}
