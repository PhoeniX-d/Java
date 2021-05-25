/* Program to print alternate prime numbers */

import java.util.Scanner;
public class AlternatePrime
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        printAlternatePrime(iVal);
    }

    public static void printAlternatePrime(int iVal)
    {
        int iCnt = 0;
        for(int i = 2; i <= iVal; i++)
        {
            if(isPrime(i))
            {
                if(iCnt % 2 == 0)
                {
                    System.out.print(i + " ");
                }
                iCnt++;
            }
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
