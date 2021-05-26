/*
    Circular Prime : A circular prime is a prime number with the property that the number generated at each
    intermediate step when cyclically permuting its (base 10) digits will be prime.
    For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime.
    A circular prime with at least two digits can only consist of combinations of the digits 1, 3, 7 or 9
    because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2,
    and having 0 or 5 as the last digit makes it divisible by 5.
*/

import java.util.Scanner;

public class IsCicularPrime
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isCyclicPrime(lNum);
        if(b == true)
            System.out.println(lNum + " is Circular prime number");
        else
            System.out.println(lNum + " is not Circular prime number");
    }

    public static boolean isPrime(long lNum)
    {
        lNum = lNum < 0 ? -lNum : lNum;
        if(lNum == 0)
        {
            return false;
        }
        int i = 0;
        for(i = (int)(lNum / 2); i > 1; i--)
        {
                if(lNum % i == 0)
                {
                    break;
                }
        }        
        return (i == 1 || lNum == 1 || lNum == -1);
    }

    public static boolean isCyclicPrime(long lNum)
    {
        int iLength = Long.toString(lNum).length();
        boolean flag = true;
        int iDig = 0;
        for(int i = 1 ; i < iLength; i++)
        {
            if(!isPrime(lNum))
            {
                flag = false;
                break;
            }
            iDig = (int)(lNum % 10);
            lNum = lNum / 10;
            lNum = lNum + iDig * (long)Math.pow(10, iLength - 1);
        }
        if(flag == true)
            return true;
        else return false;
    }
}
