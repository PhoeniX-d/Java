/* Program to check whether number is balanced or not */

import java.util.Scanner;
public class CheckBalancedX
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iCnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        if(evOddFreq(lVal))
        {
            System.out.println("Balanced Number");
        }
        else
        {
            System.out.println("Not a Balanced Number");
        }
        if(evOddFreqRec(lVal, iCnt))
        {
            System.out.println("Balanced Number");
        }
        else
        {
            System.out.println("Not a Balanced Number");
        }
    }

    public static boolean evOddFreq(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iCnt = 0, iDigit = 0;
        if(iNum == 0)
            return false;
        while(iNum != 0)
        {
            iDigit = (int)iNum % 10;
            if(iDigit % 2 == 0)
            {
                iCnt++;
            }
            else
            {
                iCnt--;
            }
            iNum = iNum / 10;
        } 
        return (iCnt == 0);
    }

    public static boolean evOddFreqRec(long iNum, int iCnt)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iDigit = 0;
        if(iNum == 0)
        {
            return (iCnt == 0);
        }
        else
        {
            iDigit = (int)iNum % 10;
            if(iDigit % 2 == 0)
            {
                iCnt++;
            }
            else
            {
                iCnt--;
            }
            return evOddFreqRec(iNum / 10, iCnt);
        }
    }
}
