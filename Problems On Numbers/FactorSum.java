/* Program to find sum of factors */

import java.util.Scanner;
public class FactorSum
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
        int iRet = factorSum(iVal);
        System.out.print("Summation of factors is " + iRet);
    }

    public static int factorSum(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       boolean flag = false;
       int iSum = 0;
       for(int i = 2; i <= iNum / 2; i++)
       {
            if(iNum % i == 0)
            {
                iSum = iSum + i;
                flag = true;
            }
       }
       if(flag == false)
       {
            if(iNum == 1)
            {
                iSum = 1;
            }
            else
            {
                iSum = 1 + iNum;
            }
       }
       return iSum;
    }
}
