import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BuffReadInt
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isrObj = new InputStreamReader(System.in);
        BufferedReader brObj = new BufferedReader(isrObj);

        System.out.print("Enter the integer:\t");
        String str = brObj.readLine();
        int i = Integer.parseInt(str);

        System.out.print("You entered :\t" + i);
        brObj.close();
        isrObj.close();
    }
}
