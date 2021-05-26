/*
    A palindrome number is a number that is same after reverse. 
    For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
*/

import java.util.Scanner;
public class IsPalindrome
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;

        boolean b = isPalindrome(lNum);
        if(b == true)
            System.out.println(lNum + " is palindrome");
        else
            System.out.println(lNum + " is not palindrome");

    }

    public static boolean isPalindrome(long lNum)
    {
        long rev = 0L, temp = lNum;
        while(temp > 0)
        {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if(rev == lNum)
            return true;
        else
            return false;
    }
}