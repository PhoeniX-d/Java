/* Program to calculate product of digits in a number */

import java.util.Scanner;
public class DigitEvOdFreq
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iE = 0, iO = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        evOddFreq(lVal);
        evOddFreqRec(lVal, iE, iO);
    }

    public static void evOddFreq(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iE = 0, iO = 0, iDigit = 0;
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
        System.out.println("\nFrequency of even digits is " + iE);      
        System.out.println("Frequency of odd digits is " + iO);      
    }

    public static void evOddFreqRec(long iNum, int iE, int iO)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iDigit = 0;
        if(iNum == 0)
        {
            System.out.println("\nUsing Recursion\nFrequency of even digits is " + iE);      
            System.out.println("Frequency of odd digits is " + iO);
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
            evOddFreqRec(iNum / 10, iE, iO);
        }
    }
}
