/*
    Lychrel Number is a natural number that cannot form a palindrome through the iterative process
    of repeatedly reversing its digits and adding the resulting numbers.
    The process is sometimes called the 196-algorithm,after the most famous number associated with the process. 
*/

import java.util.Scanner;

public class IsLychrel
{
    static final int MAX_ITR = 20;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long lNum = 0;
        boolean bRet = false;
        System.out.print("Enter the number\t= ");
        lNum = s.nextLong();
        bRet = isLychrel(lNum);
        if(bRet == true)
        {
            System.out.println(lNum + " It is Lychrel number");
        }
        else
        {
            System.out.println(lNum + " It is not Lychrel number");
        }
    }

    static boolean isLychrel(long lNum)
    {
        long lSum = 0l;
        int i = 0;
        for(i = 1; i <= MAX_ITR; i++)
        {
            lSum = lSum + reverse(lNum);
            System.out.println(lSum);
            if(isPalindrome(lSum))
            {
                break;
            }
        }
        if(i > MAX_ITR)
        {
            return true;
        }
        return false;
    }

    static boolean isPalindrome(long lNum)
    {
        return (lNum == reverse(lNum));
    }

    static long reverse(long lNum)
    {
        long lRev = 0;
        int iDig = 0;
        while(lNum > 0)
        {
            iDig = (int)(lNum % 10);
            lRev = lRev * 10 + iDig;
            lNum = lNum / 10;
        }
        System.out.println(lRev);
        return lRev;
    }
}