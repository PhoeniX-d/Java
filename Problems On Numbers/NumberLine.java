/* Program to print number line */
import java.util.Scanner;
public class NumberLine 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number\t= ");
        iVal = sc.nextInt();
       
        sc.close();
        numberLine(iVal);
    }

    public static void numberLine(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        for(int i = -iNum; i <= iNum; i++)
        {
            System.out.print(i + " ");
        }
    }
}
