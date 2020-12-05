import java.util.Scanner;
import java.io.*;

class CountSequence
{
    public static int countSequence(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iMask = 0x0000007, iCnt = 0, iRes = 0;
        while (iNum != 0)
        {
            iRes = iMask & iNum;
            if (iRes == iMask)
            {
                iCnt++;
                iNum = iNum >> 3;
            } 
            else
            {
                iNum = iNum >> 1;
            }
        }
        return iCnt;
    }
}

class CountSeq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iNum, iRet;
        System.out.print("Enter the number:\t");
        iNum = sc.nextInt();
        iRet = CountSequence.countSequence(iNum);
        System.out.println("Total consecutive three 1's in number is:\t" + iRet);
        sc.close();
    }
}
