import java.io.*;

class ExtractFiles
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String line = br1.readLine();        
        while (line != null)
        {
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            boolean isAvail = false;
            String target = br2.readLine();
            while(target != null)
            {
                if (line.equals(target)) {
                    isAvail = true;
                    break;
                }
                target = br2.readLine();
            }
            if(isAvail == true)
            {
                pw.println(line);
                pw.flush();
            }
            line = br1.readLine();
            br2.close();
        }
        br1.close();
        pw.close();
    }    
}
