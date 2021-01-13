import  java.io.*;
interface Fees
{
    double showFees();
}

class CSE implements Fees
{
    public double showFees()
    {
        return 60000.00;
    }
}

class ECE implements Fees
{
    public double showFees()
    {
        return 50000.00;
    }
}

class CourseFees
{
    public static Fees getFees(String course)
    {
        if(course.equalsIgnoreCase("CSE"))
        {
            return new CSE();
        }
        else if(course.equalsIgnoreCase("ECE"))
        {
            return new ECE();
        }
        else
        {
            return null;
        }
    }
}
class MyFactoryMethod
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the course name:");
        String s = br.readLine();

        Fees f = CourseFees.getFees(s);

        System.out.println("The fees is Rs:\t" + f.showFees());
    }
}
