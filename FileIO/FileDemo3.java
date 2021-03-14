import java.io.*;

class FileDemo
{
    public static void main(String[] args) throws IOException{
        
        File f = new File("C:\\Users\\Pranav\\Desktop\\Programming");
        String s[] = f.list();
        for(String s1 : s)
        {
            System.out.println(s1);
        }
        System.out.println("Total Files = " + s.length);
    }
}