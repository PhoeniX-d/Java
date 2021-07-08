import java.util.Scanner;
import java.io.*;

class IsAnagramSolution
{
    public boolean isAnagram(long lNum1, long lNum2)
    {
        int iArr[] = new int[10];
        int iDig1 = 0, iDig2 = 0, i = 0;      
        if(lNum1 < 0)
        {
            lNum1 = -lNum1;
        }
        if(lNum2 < 0)
        {
            lNum2 = -lNum2;
        }
        while(lNum1 != 0 && lNum2 != 0)
        {
            iDig1 = (int) (lNum1 % 10);
            iDig2 = (int) (lNum2 % 10);
            iArr[iDig1]++;
            iArr[iDig2]--;
            lNum1 = lNum1 / 10;
            lNum2 = lNum2 / 10;
        }

        if (lNum1 != 0 && lNum2 != 0)
        {
            return false;
        }

        for(i = 0; i < 10; i++)
        {
            if (iArr[i] != 0) {
                break;
            }
        }
        if(i == 10)
        {
            return true;
        }
        return false;
    }
}

class IsAnagram
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.print("Enter the number 1:\t");
        long lNum1 = sObj.nextLong();
        System.out.print("Enter the number 2:\t");
        long lNum2 = sObj.nextLong();

        boolean bRet = false;
        IsAnagramSolution ilObject = new IsAnagramSolution();
        bRet = ilObject.isAnagram(lNum1, lNum2);
        if(bRet == true)
        {
            System.out.println("Enterd numbers are Anagram Number");
        }
        else
        {
            System.out.println("Enterd numbers are not Anagram Number");
        }
        sObj.close();
    }
}
