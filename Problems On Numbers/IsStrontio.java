/*
   Strontio numbers are those four digits numbers when multiplied by 2 give the same digit 
   at the hundreds and tens place.Remember that the input number must be a four-digit number.
   strontio numbers are 1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 1001, 2002, 3003, etc.
*/

import java.util.Scanner;
public class IsStrontio
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        iNum = iNum < 0 ? -iNum : iNum;
        int iLen = getCountDig(iNum);
        while(iLen != 4)
        {
            System.out.println("\nFor Strontio number number of digits must be exactly 4\nTry again!!\n");
            System.out.print("Enter the number\t= ");
            iNum = sc.nextInt();
            iNum = iNum < 0 ? -iNum : iNum;
            iLen = getCountDig(iNum);
        }

        sc.close();
        boolean b = isStrontio(iNum);
        if(b == true)
            System.out.println(iNum + " is Strontio number");
        else
            System.out.println(iNum + " is not Strontio number");
    }

    public static boolean isStrontio(int iNum)
    {
        int iLen = Integer.toString(iNum).length();
        if(iLen != 4)
            return false;
        int iTPlace = 0, iHPlace = 0;
        iNum = iNum * 2;
        iNum = iNum / 10;
        iTPlace = iNum % 10;
        iNum = iNum / 10;
        iHPlace = iNum % 10;
        if(iTPlace == iHPlace)
            return true;
        else
            return false;           
    }

    static int getCountDig(int iNum)
    {
        int iCnt = 0;
        while(iNum > 0)
        {
            iCnt++;
            iNum = iNum / 10;
        }
        return iCnt;
    }
}
