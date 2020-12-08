import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BuffReadChar
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isrObj = new InputStreamReader(System.in);
        BufferedReader brObj = new BufferedReader(isrObj);

        System.out.print("Enter the character:\t");
        char ch = (char)brObj.read();

        System.out.print("You entered :\t" + ch);
        brObj.close();
        isrObj.close();
    }
}
