import java.util.Scanner;
import java.io.*;

class Bitwise
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iNum1, iNum2, iRet;
        System.out.print("Enter the number 1:\t");
        iNum1 = sc.nextInt();
        System.out.print("Enter the number 2:\t");
        iNum2 = sc.nextInt();
        iRet = BitwiseSolution.gen(iNum1, iNum2);
        System.out.println("Result is:\t" + iRet);
        sc.close();
    }
}

class BitwiseSolution
{
    public static int gen(int iNum1, int iNum2)
    {
        if(iNum1 < 0)
        {
            iNum1 = -iNum1;
        }
        if(iNum2 < 0)
        {
            iNum2 = -iNum2;
        }
        
        int iNum, iNo1, iNo2, iMask1 = 0xffff0000, iMask2 = 0x0000ffff;
        iNo1 = iMask1 & iNum1;
        iNo2 = iMask2 & iNum2;
        iNum = iNo1 | iNo2;
        return iNum;
    }
}
