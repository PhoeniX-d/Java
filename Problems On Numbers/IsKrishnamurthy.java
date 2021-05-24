/*
     A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number.
     Krishnamurthy number is also referred to as a Strong number.
*/

import java.util.Scanner;
public class IsKrishnamurthy
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isKrishnamurthy(iNum);
        if(b == true)
            System.out.println(iNum + " is Krishnamurthy number");
        else
            System.out.println(iNum + " is not Krishnamurthy number");
    }

    public static boolean isKrishnamurthy(int iNum)
    {
        int iDig = 0, iSum = 0, iFact = 0, iTemp = iNum, i = 0;
        if(iNum == 0)
            return false;
        if(iNum == 1)
            return true;
        
        while(iTemp > 0)
        {
            iDig = iTemp % 10;
            if(iDig == 0)
                iFact = 1;
            else
            {
                for(i = 1, iFact = 1; i <= iDig; i++)
                {
                    iFact = iFact * i;
                }
            }
            iSum = iSum + iFact;
            if(iSum > iNum)
                break;
            iTemp = iTemp / 10;
        }
        return (iSum == iNum);
    }
}
