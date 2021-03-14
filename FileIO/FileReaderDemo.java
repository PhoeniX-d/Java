import java.io.*;
class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int) f.length()];
        fr.read(ch);
        for (char c : ch)
        {
            System.out.print(c);
        }
        fr.close();
    }    
}
