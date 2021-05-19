/* Program to calculate product of digits in a number */

import java.util.Scanner;
public class DigitProduct
{
    public static void main(String[] args) 
    {
        long lVal = 0;
        int iMult = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lVal = sc.nextLong();
        sc.close();
        int iRet = digitProd(lVal);
        System.out.println("Product of digits is\t\t= " + iRet);
        iMult = digitProdRec(iMult, lVal);
        System.out.println("Product of digits is(Recirsive)\t= " + iMult);
    }

    public static int digitProd(long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iMult = 0, iDigit = 0;
        while(iNum != 0)
        {
            iDigit = (int)iNum % 10;
            if(iDigit!= 0)
            {
                if(iMult == 0)
                    iMult = 1;
                iMult = iMult * iDigit;
            }
            iNum = iNum / 10;
        }       
        return iMult;
    }

    public static int digitProdRec(int iMult, long iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int iDigit = 0;
        if(iNum == 0)
        {
            return iMult;
        }
        iDigit = (int)(iNum % 10);
        if(iDigit != 0)
        {
            if(iMult == 0)
                iMult = 1;
            iMult = iMult * iDigit;
            return digitProdRec(iMult, iNum / 10);
        }    
        return digitProdRec(iMult, iNum / 10);       
    }
}
