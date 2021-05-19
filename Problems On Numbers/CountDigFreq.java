/* Program to count frequency of a digit in a number */

import java.util.Scanner;
public class CountDigFreq 
{
    public static void main(String[] args) 
    {
        long lNum = 0;
        int iDig = 0;
        int iCnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t\t= ");
        lNum = sc.nextLong();
        System.out.print("Enter the digit\t\t\t= ");
        iDig = sc.nextInt();
        sc.close();
        int iRet = countDigits(lNum, iDig);
        System.out.println("Total digits are\t\t= " + iRet);
        iCnt = countDigitsRec(lNum, iDig);
        System.out.println("Total digits are(Recirsive)\t= " + iCnt);
    }

    public static int countDigits(long lNum, int iDig)
    {
        lNum = lNum < 0 ? -lNum : lNum;
        iDig = iDig < 0 ? -iDig : iDig;
        
        int iCnt = 0;
        while(lNum != 0)
        {
            if((int)lNum % 10 == iDig)
                iCnt++;
            lNum = lNum / 10;
        }       
        return iCnt;
    }

    
    public static int countDigitsRec(long lNum, int iDig)
    {
        lNum = lNum < 0 ? -lNum : lNum;
        if(lNum == 0)
        {
            return 0;
        }
        else if((int)(lNum % 10) == iDig)
        {
            return 1 + countDigitsRec(lNum / 10, iDig);
        }
        return countDigitsRec(lNum / 10, iDig);
    }
}
