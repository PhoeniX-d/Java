/* Program to return reverse of a number */

import java.util.Scanner;
public class NumberReverse
{
    static long reverse;
    public static void main(String[] args) 
    {
        long lVal = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        long iRet = reverseNum(lVal);
        System.out.println("Reversed number is\t\t= " + iRet);
        iRet = reverseNumRec(lVal);
        System.out.println("Reversed number is(Recirsive)\t= " + iRet);
    }

    public static long reverseNum(long lNum)
    {
        int flag = 1;
        if(lNum < 0)
        {
            flag = -1;
            lNum = -lNum;
        }
        long rev = 0;
        while(lNum != 0)
        {
            rev = rev * 10 + (lNum % 10);
            lNum = lNum / 10;
        }       
        return rev * flag;
    }

    public static long reverseNumRec(long lNum)
    {
        int flag = 1;
        if(lNum < 0)
        {
            flag = -1;
            lNum = -lNum;
        }
        if(lNum == 0)
            return reverse * flag;
        else
        {
            reverse = reverse * 10 + (lNum % 10);
            reverseNumRec(lNum / 10);
        }
        return reverse * flag;
    }
}
