/* Program to find factors of a number */

import java.util.Scanner;
public class FindLargestFactor 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        int iRet = largestFactorOf(iVal);
        System.out.println("Largest factor of " + iVal +" is " + iRet);
    }

    public static int largestFactorOf(int iNum)
    {
        if(iNum == 0)
        {
            return 0;
        }
        iNum = iNum < 0 ? -iNum : iNum;
        int i = 0;
        for(i = iNum / 2; i >= 1; i--)
        {
            if(iNum % i == 0)
            {
                break;                   
            }
        }
        return i;
    }
}
