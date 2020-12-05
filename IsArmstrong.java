import java.util.Scanner;
import java.io.*;

class IsArmstrongSolution
{
    public boolean isArmstrong(long lNum)
    {
        int iArr[] = new int[10];
        int iDig = 0, iLen = 0, i = 0, iSum = 0, iMult = 1;
        long lTemp = lNum;
        
        if(lNum < 0)
        {
            lNum = -lNum;
        }
        if(lNum == 0)
        {
            return false;
        }
        while (lNum != 0)
        {
            iLen++;
            lNum = lNum / 10;
        }
        lNum = lTemp;
        while(lNum != 0)
        {
            iDig = (int) (lNum % 10);
            if (iDig == 0)
            {
                iMult = 1;
            }
            for (i = 0, iMult = 1; i < iLen; i++) 
            {
                iMult = iMult * iDig;
            }
            iSum = iSum + iMult;
            if (iSum > lTemp)
            {
                break;
            }
            lNum = lNum / 10;
        }
        if (iSum == lTemp)
        {
            return true;
        }
        return false;
    }
}

class IsArmstrong
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        long lNum = sObj.nextLong();
        boolean bRet = false;
        IsArmstrongSolution ilObject = new IsArmstrongSolution();
        bRet = ilObject.isArmstrong(lNum);
        if(bRet == true)
        {
            System.out.println("Enterd number is a Armstrong Number");
        }
        else
        {
            System.out.println("Enterd number is a not Armstrong Number");
        }
        sObj.close();

    }
}
