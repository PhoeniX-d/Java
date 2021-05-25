/*
    A number will be called Disarium or Unhappy if the sum of its digits powered with their respective 
    position is equal with the number itself.
    DISARIUM are 89, 175, 518 etc.
*/

import java.util.Scanner;
public class IsUnhappy
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        
        for(int i = 1; iNum > 0; i++)
        {
            if(isUnhappy(i))
            {
                System.out.print(i + " ");
                iNum--;
            }
        }
        
        /*
        boolean b = isUnhappy(iNum);
        if(b == true)
            System.out.println(iNum + " is Unhappy or Disarium number");
        else
            System.out.println(iNum + " is not Unhappy or Disarium number");
        */
    }

    public static boolean isUnhappy(int iNum)
    {
        int iDig = 0, iCnt = 0, iSum = 0, iTemp = iNum;
        while(iTemp > 0)
        {
            iCnt++;
            iTemp = iTemp / 10;
        }
        iTemp = iNum;
        while(iNum > 0)
        {
            iDig = iNum % 10;
            iSum = iSum + (int)Math.pow(iDig, iCnt);
            iCnt--;
            iNum = iNum / 10;
        }
        if(iTemp == iSum)
            return true;
        else 
            return false;
    }
}
