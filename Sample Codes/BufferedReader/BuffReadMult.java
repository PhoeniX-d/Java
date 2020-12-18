import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BuffReadMult
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isrObj = new InputStreamReader(System.in);
        BufferedReader brObj = new BufferedReader(isrObj);

        System.out.print("Enter the Employee ID:\t");
        int id = Integer.parseInt(brObj.readLine());

        System.out.print("Enter the Employee Name:\t");
        String name = brObj.readLine();

        System.out.print("Enter the Employee Gender (M/F):\t");
        // char gender = (char) brObj.read();

        char gender = (char) brObj.readLine().charAt(0);
        // brObj.skip(2);

        System.out.print("Enter the Employee Salary:\t");
        double salary = Double.parseDouble(brObj.readLine());

        System.out.println("Name Of Employee :\t" + name);
        System.out.println("Gender Of Employee :\t" + gender);
        System.out.println("ID Of Employee :\t" + id);
        System.out.println("Salary Of Employee :\t" + salary);

        brObj.close();
        isrObj.close();
    }
}
