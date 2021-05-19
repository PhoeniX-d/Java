/* Program to find sum of factors */

import java.util.Scanner;
public class NonFactorSum
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
        int iRet = nonFactorSum(iVal);
        System.out.print("Summation of non-factors is " + iRet);
    }

    public static int nonFactorSum(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       int iSum = 0;
       for(int i = 2; i < iNum; i++)
       {
            if(iNum % i != 0)
            {
                iSum = iSum + i;
            }
       }
       return iSum;
    }
}
