/* Program to check whether number is balanced or not */

import java.util.Scanner;
public class CheckBalanced
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iE = 0, iO = 0;
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
        if(evOddFreqRec(lVal, iE, iO))
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
        int iE = 0, iO = 0, iDigit = 0;
        if(iNum == 0)
            return false;
        while(iNum != 0)
        {
            iDigit = (int)iNum % 10;
            if(iDigit % 2 == 0)
            {
                iE++;
            }
            else
            {
                iO++;
            }
            iNum = iNum / 10;
        } 
        return (iE == iO);
    }

    public static boolean evOddFreqRec(long iNum, int iE, int iO)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iDigit = 0;
        if(iNum == 0)
        {
            return (iE == iO);
        }
        else
        {
            iDigit = (int)iNum % 10;
            if(iDigit % 2 == 0)
            {
                iE++;
            }
            else
            {
                iO++;
            }
            return evOddFreqRec(iNum / 10, iE, iO);
        }
    }
}
