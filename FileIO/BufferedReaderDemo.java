import java.io.*;
class BufferedReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
    }    
}
