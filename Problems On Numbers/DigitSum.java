/* Program to calculate sum of digits in a number */

import java.util.Scanner;
public class DigitSum 
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        int iRet = digitSum(lVal);
        System.out.println("Summation of digits is\t\t\t= " + iRet);
        iSum = digitSumRec(lVal);
        System.out.println("Summation of digits is(Recirsive)\t= " + iSum);
    }

    public static int digitSum(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iSum = 0;
        while(iNum != 0)
        {
            iSum = iSum + (int)(iNum % 10);
            iNum = iNum / 10;
        }       
        return iSum;
    }

    public static int digitSumRec(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum == 0)
        {
            return 0;
        }
        return ((int)(iNum % 10) + digitSumRec(iNum / 10));
    }
}
