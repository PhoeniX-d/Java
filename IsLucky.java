import java.util.Scanner;
import java.io.*;

class IsLuckSolution
{
    public boolean isLucky(long lNum)
    {
        if(lNum < 0)
        {
            lNum = -lNum;
        }
        int iArr[] = new int[10];
        int iDig = 0;
        while(lNum != 0)
        {
            iDig = (int)(lNum % 10);
            iArr[iDig]++;
            if(iArr[iDig] > 1)
            {
                break;
            }
            lNum = lNum / 10;
        }
        if(lNum == 0)
        {
            return true;
        }
        return false;
    }
}

class IsLucky
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        long lNum = sObj.nextLong();
        boolean bRet = false;
        IsLuckSolution ilObject = new IsLuckSolution();
        bRet = ilObject.isLucky(lNum);
        if(bRet == true)
        {
            System.out.println("Enterd number is a Lucky Number");
        }
        else
        {
            System.out.println("Enterd number is a not Lucky Number");
        }
        sObj.close();

    }
}
