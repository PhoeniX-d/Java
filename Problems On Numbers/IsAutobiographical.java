/*
  An autobiographical number is a number (N) such that the first digit of N counts how many
  zeroes are presented in N, the second digit counts how many ones are presented in N,
  the third digit counts how many twos are presented in N, and so on.
  Sometimes, it is also known as a curious number.
*/

import java.util.Scanner;
public class IsAutobiographical
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isAutobiographical(lNum);
        if(b == true)
            System.out.println(lNum + " is Autobiographical number");
        else
            System.out.println(lNum + " is not Autobiographical number");
    }

    public static boolean isAutobiographical(long lNum)
    {
        lNum = lNum < 0 ? -lNum : lNum;
        if(lNum == 0)
            return false;
        
        String str = String.valueOf(lNum);
        int iLen = str.length(), iCnt = 0;
        boolean bFlag = true;
        int[] iDigArr = new int[iLen];
        
        for(int i = iLen - 1; i >= 0; i--)
        {
            iDigArr[i] = (int)(lNum % 10);
            lNum = lNum / 10;
        }
        for(int i = 0; i < iLen; i++)
        {
                iCnt = 0;
                for(int j = 0; j < iLen; j++)
                {
                    if(i == iDigArr[j])
                        iCnt++;
                }
                if(iCnt != iDigArr[i])
                {
                    bFlag = false;
                    break;
                }
        }
        if(bFlag)
            return true;
        else
            return false;
    }
}
