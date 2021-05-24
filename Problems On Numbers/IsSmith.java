/*
    A Smith number is a composite number whose sum of digits equals to the sum of 
    digits of its prime factors, excluding 1.It is also known as a joke number.
*/

import java.util.Scanner;
public class IsSmith
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isSmith(iNum);
        if(b == true)
            System.out.println(iNum + " is Smith number");
        else
            System.out.println(iNum + " is not Smith number");
    }

    public static boolean isSmith(int iNum)
    {
        int iDigitSum = 0, iPrimeDigSum = 0;
        iPrimeDigSum = getPrimeDigSum(iNum);
        iDigitSum = getDigSum(iNum);       
        if(iDigitSum == iPrimeDigSum)
            return true;
        else
            return false;        
    }

    static int getPrimeDigSum(int iNum)
    {
        int i = 0, iSum = 0;
        for(i = iNum / 2; i > 1; i--)
        {
            if(iNum % i == 0)
            {
                if(isPrime(i))
                {
                    iSum = iSum + getDigSum(i);
                }
            }
        }
        return iSum;
    }

    static boolean isPrime(int iNum)
    {
        int i = 0;
        for(i = iNum / 2; i > 1; i--)
        {
            if(iNum % i == 0)
                break;
        }
        if(i == 1)
            return true;
        else return false;
    }

    static int getDigSum(int iNum)
    {
        int iDig = 0, iDigitSum = 0;
        while(iNum > 0)
        {
            iDig = iNum % 10;
            iDigitSum = iDigitSum + iDig;            
            iNum = iNum / 10;
        }
        return iDigitSum;
    }
}
