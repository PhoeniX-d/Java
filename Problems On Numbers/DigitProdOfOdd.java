/* Program to calculate product of digits in a number which are odd */

import java.util.Scanner;
public class DigitProdOfOdd
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iMult = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        int iRet = digitProd(lVal);
        System.out.println("Product of odd digits is\t\t= " + iRet);
    }

    public static int digitProd(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iMult = 0, iDigit = 0;
        while(iNum != 0)
        {
            iDigit = (int)iNum % 10;
            if(iDigit % 2 != 0)
            {
                if(iMult == 0)
                    iMult = 1;
                iMult = iMult * iDigit;
            }
            iNum = iNum / 10;
        }       
        return iMult;
    }
}
