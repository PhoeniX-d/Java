/* Program to calculate sum of digits in a number which are greater than 5 */

import java.util.Scanner;
public class DigitSumG5
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
        int iSum = 0, iDigit = 0;
        while(iNum != 0)
        {
            iDigit = (int)iNum % 10;
            if(iDigit > 5)
                iSum = iSum + iDigit;
            iNum = iNum / 10;
        }       
        return iSum;
    }

    public static int digitSumRec(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iDigit = 0;
        if(iNum == 0)
        {
            return 0;
        }
        iDigit = (int)(iNum % 10);
        if(iDigit > 5)
            return (iDigit + digitSumRec(iNum / 10));
        return digitSumRec(iNum / 10);
    }
}
