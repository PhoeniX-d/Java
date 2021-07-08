import java.util.Scanner;
import java.io.*;

class CountMaxOneSequence
{
    public static int countMaxOneSequence(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iMask = 0x00000001, iCnt = 0, iRes = 0, iMax = 0;
        while (iNum > 0)
        {
            iRes = iNum & iMask;
            if (iRes == iMask) 
            {
                iCnt++;
            } 
            else 
            {
                if (iMax < iCnt) 
                {
                    iMax = iCnt;
                }
                iCnt = 0;                
            }
            iNum = iNum >> 1;
        }
        if (iMax < iCnt) 
        {
            return iCnt;
        }
        return iMax;
    }
}

class CountMaxOneSeq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iNum, iRet = 0;
        System.out.print("Enter the number:\t");
        iNum = sc.nextInt();
        iRet = CountMaxOneSequence.countMaxOneSequence(iNum);
        System.out.println("Length of Maximum consecutive 1's in number is:\t" + iRet);
        sc.close();
    }
}
