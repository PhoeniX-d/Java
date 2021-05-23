/*
    A positive integer n is called a sphenic number if the product of factors of the given number (n)
    is exactly three and all factors are prime. In other words, if n is a sphenic integer 
    then n=p x q x r (p, q, and are three distinct prime numbers and their product are n).
*/

import java.util.Scanner;
public class IsSphenic
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isSphenic(lNum);
        if(b == true)
            System.out.println(lNum + " is Sphenic number");
        else
            System.out.println(lNum + " is not Sphenic number");
    }

    public static boolean isSphenic(long lNum)
    {
        int i = 0, count = 0;
        long prod = 1l;
        for(i = 2; i <= lNum / 2 && prod < lNum; i++)
        {
            if(lNum % i == 0  && count <= 6)
            {
                count++;
                if(isPrime(i))
                {
                    prod = prod  * i;
                    System.out.println(count + " " + i);
                    System.out.println(prod);
                }
            }
        }
        if (count <= 6 && prod == lNum)    
            return true;
        else
            return false;  
    }
    
    static boolean isPrime(long lNum)
    {
        long l = 0l;
        if(lNum == 2)
        {
            return true;
        }
        else if(lNum % 2 != 0)
        {
            for(l = lNum / 2; l > 1; l--)
            {
                if(lNum % l == 0)
                    break;
            }
        }
        return (l == 1);
    }
}
