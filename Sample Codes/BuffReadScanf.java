import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BuffReadScanf
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isrObj = new InputStreamReader(System.in);
        BufferedReader brObj = new BufferedReader(isrObj);

        System.out.print("Enter the Employee ID, Name, Gender and Salary:\t");
        String sToken = brObj.readLine();

        StringTokenizer st = new StringTokenizer(sToken, " ");

        int id = Integer.parseInt(st.nextToken());
        String name = st.nextToken();
        name = name.trim();
        char gender = st.nextToken().charAt(0);
        float salary = Float.parseFloat(st.nextToken());

        System.out.println("Name Of Employee :\t" + name);
        System.out.println("Gender Of Employee :\t" + gender);
        System.out.println("ID Of Employee :\t" + id);
        System.out.println("Salary Of Employee :\t" + salary);

        brObj.close();
        isrObj.close();
    }
}
