/* Program to find whether number is Prime or not */

import java.util.Scanner;
public class CheckPrime
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        boolean bRet = isPrime(iVal);
        if(bRet)
        {
            System.out.println(iVal + " is Prime number");
        }
        else
        {
            System.out.println(iVal + " is not a Prime number");
        }
    }

    public static boolean isPrime(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum == 0)
        {
            return false;
        }
        int i = 0;
        for(i = iNum / 2; i > 1; i--)
        {
                if(iNum % i == 0)
                {
                    break;
                }
        }        
        return (i == 1 || iNum == 1 || iNum == -1);
    }
}
