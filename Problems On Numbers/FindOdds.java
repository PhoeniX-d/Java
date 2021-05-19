/* Program to print upto particular number of odd numbers */

import java.util.Scanner;
public class FindOdds 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        uptoOdds(iVal);
    }

    public static void uptoOdds(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       System.out.println("Odd numbers are");
       for(int i = 1; iNum > 0; i++, iNum--)
       {
            if(i % 2 != 0)
            {
                System.out.print(i + " ");
            }
       }
    }
}
