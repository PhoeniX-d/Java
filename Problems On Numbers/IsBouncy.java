/*
    Increasing Numbers
    In an integer traversing from left to right if the current digit is greater
    than or equal to the previous digit, the number is known as increasing numbers.
    For example, 1233, 13689, 112334566, etc.    

    Decreasing Numbers
    In an integer traversing from left to right if the current digit is less than the previous digit,
    the number is known as decreasing numbers.
    For example, 321, 88531, 8755321, etc.

    Bouncy Number - 
    A positive integer that is neither in increasing nor decreasing number is called a bouncy number.
    It means they bounce between increasing and decreasing.
    In other words, we can say that if the digits of the number are unsorted.

*/

import java.util.Scanner;
public class IsBouncy
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isBouncy(iNum);
        if(b == true)
            System.out.println(iNum + " is Bouncy number");
        else
            System.out.println(iNum + " is not Bouncy number");
    }

    public static boolean isBouncy(int iNum)
    {
        if(iNum < 101 || isIncreasing(iNum) || isDecreasing(iNum))
            return false;
        else
            return true;
    }

    static boolean isIncreasing(int iNum)
    {
        String s = Integer.toString(iNum);
        boolean flag = true;
        for(int i = 0; i < s.length() - 2; i++)
        {
            if(s.charAt(i) > s.charAt(i + 1))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static boolean isDecreasing(int iNum)
    {
        String s = Integer.toString(iNum);
        boolean flag = true;
        for(int i = 0; i < s.length() - 2; i++)
        {
            if(s.charAt(i) < s.charAt(i + 1))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
