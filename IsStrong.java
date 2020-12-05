import java.util.Scanner;
import java.io.*;

class IsStrongSolution
{
    public boolean isStrong(long lNum)
    {
        int iArr[] = new int[10];
        int iDig = 0, iFact = 1, i = 0, iSum = 0;
        long lTemp = lNum;
        
        if(lNum < 0)
        {
            lNum = -lNum;
        }
        if(lNum == 0)
        {
            return false;
        }        
        while(lNum != 0)
        {
            iDig = (int) (lNum % 10);
            for (i = 1, iFact = 1; i <= iDig; i++) 
            {
                iFact = iFact * i;
            }
            iSum = iSum + iFact;
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

class IsStrong
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        long lNum = sObj.nextLong();
        boolean bRet = false;
        IsStrongSolution ilObject = new IsStrongSolution();
        bRet = ilObject.isStrong(lNum);
        if(bRet == true)
        {
            System.out.println("Enterd number is a Strong Number");
        }
        else
        {
            System.out.println("Enterd number is a not Strong Number");
        }
        sObj.close();

    }
}
