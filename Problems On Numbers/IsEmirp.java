/*
    A number is called an emirp number if we get another prime number on reversing the number itself. 
    In other words, an emirp number is a number that is prime forwards or backward. 
    It is also known as twisted prime numbers.
*/

import java.util.Scanner;
public class IsEmirp
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isEmirp(lNum);
        if(b == true)
            System.out.println(lNum + " is Emirp number");
        else
            System.out.println(lNum + " is not Emirp number");
    }

    public static boolean isEmirp(long lNum)
    {
        if(isPrime(lNum) == false)
            return false;
        long lRev = 0l, lTemp = lNum;
        while(lNum > 0)
        {
            lRev = lRev * 10 + (lNum % 10);
            lNum = lNum / 10;
        }
        if(isPrime(lRev) && lRev != lTemp)
            return true;
        else
            return false;            
    }
    
    static boolean isPrime(long lNum)
    {
        long l = 0l;
        for(l = lNum / 2; l > 1; l--)
        {
            if(lNum % l == 0)
                break;
        }
        return (l == 1);
    }
}
