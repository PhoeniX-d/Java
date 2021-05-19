/* Program to find sum of factors */

import java.util.Scanner;
public class DiffFactorNonFactor
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the  number\t= ");
        iVal = sc.nextInt();
       
        sc.close();
        int iRet = nonFactorSum(iVal);
        System.out.println("Difference between summation of factors and non-factors is " + iRet);
    }

    public static int nonFactorSum(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       if(iNum == 0)
       {
           return 0;
       }
       int iFSum = 0, iNFSum = 0;
       for(int i = 1; i < iNum; i++)
       {
            if(iNum % i != 0)
            {
                iNFSum = iNFSum + i;
            }
            else
            {
                iFSum = iFSum + i;
            }
       }
       return iFSum - iNFSum;
    }
}
