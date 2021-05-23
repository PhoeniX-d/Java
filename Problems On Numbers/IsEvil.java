/*
    The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.
    Unlike Prime and Armstrong numbers, Evil number is not so popular and asked by the interviewers.
*/

import java.util.Scanner;
public class IsEvil
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();
        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isEvil(iNum);
        if(b == true)
            System.out.println(iNum + " is Evil number");
        else
            System.out.println(iNum + " is not Evil number");
    }

    public static boolean isEvil(int iNum)
    {
        if(iNum == 0)
            return false;
        int iNumBin = 0x00000001, iCnt = 0;
        while(iNum > 0)
        {
            if((iNum & iNumBin) == 1)
                iCnt++;
            iNum = iNum >> 1;
        }
        return (iCnt % 2 == 0);
    }
}
