import java.util.Scanner;

/*
*   Program to count digits between 3 and 7 from given number
*/

class ProductofDigits
{
    public static void main(String argv[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the number\t:");
        int iNum = sObj.nextInt();
        ProductofDigitsSol cObj = new ProductofDigitsSol();
        int iRet = cObj.digProd(iNum);
        System.out.printf("Product of Digits\t:%d", iRet);
        sObj.close();
    }
}

class ProductofDigitsSol
{
    public int digProd(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iProd = 1, iDig = 0;
        while(iNum != 0)
        {
            iDig = iNum % 10;
            if (iDig == 0) {
                iDig = 1;
            }
            iProd = iProd * iDig;
            iNum = iNum / 10;
        }
        return iProd;
    }
}