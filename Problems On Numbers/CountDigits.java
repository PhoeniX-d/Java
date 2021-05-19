/* Program to count number of digits in a number */

import java.util.Scanner;
public class CountDigits 
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iCnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        int iRet = countDigits(lVal);
        System.out.println("Total digits are\t\t= " + iRet);
        iCnt = countDigitsRec(lVal);
        System.out.println("Total digits are(Recirsive)\t= " + iCnt);
    }

    public static int countDigits(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum == 0)
            return 1;
        int iCnt = 0;
        while(iNum != 0)
        {
            iNum = iNum / 10;
            iCnt++;
        }       
        return iCnt;
    }

    public static int countDigitsRec(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum / 10 == 0)
            return 1;
        else
        {
            return 1 + countDigitsRec(iNum / 10);
        }
    }
}
