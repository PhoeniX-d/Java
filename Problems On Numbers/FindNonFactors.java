/* Program to find factors of a number */

import java.util.Scanner;
public class FindNonFactors 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
       
        if(iVal == 0)
        {
            System.out.print("Cannot find factors of zero!!");
            System.exit(0);
        }
        sc.close();
        nonFactorsOf(iVal);
    }

    public static void nonFactorsOf(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       System.out.println("Non-Factors are");
       for(int i = 2; i < iNum; i++)
       {
            if(iNum % i != 0)
            {
                System.out.print(i + " ");
            }
       }
    }
}
