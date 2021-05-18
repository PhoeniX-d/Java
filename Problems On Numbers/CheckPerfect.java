/* Program to find whether number is perfect or not */

import java.util.Scanner;
public class CheckPerfect
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        boolean bRet = isPerfect(iVal);
        if(bRet)
        {
            System.out.println(iVal + " is Perfect number");
        }
        else
        {
            System.out.println(iVal + " is not a Perfect number");
        }
    }

    public static boolean isPerfect(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum == 0)
        {
            return false;
        }
        int iSum = 0;
        for(int i = 1; i <= iNum / 2 && iSum <= iNum; i++)
        {
                if(iNum % i == 0)
                {
                    iSum = iSum + i;
                }
        }        
        return (iSum == iNum || iNum == 1 || iNum == -1);
    }
}
