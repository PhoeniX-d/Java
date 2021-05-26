/*
    Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is
    divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) 
    and 171 is divisible by 9.
*/

import java.util.Scanner;
public class IsHarshad
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        ///*
        for(int i = 1; iNum > 0; i++)
        {
            if(isHarshad(i))
            {
                System.out.print(i + " ");
                iNum--;
            }
        }
       // */
        /*
        boolean b = isHarshad(iNum);
        if(b == true)
            System.out.println(iNum + " is Harshad number");
        else
            System.out.println(iNum + " is not Harshad number");
        */
    }

    public static boolean isHarshad(int iNum)
    {
        int iDig = 0, iSum = 0, iTemp = iNum;
        while(iNum > 0)
        {
            iDig = iNum % 10;
            iSum = iSum + iDig;
            iNum = iNum / 10;
        }
        if(iTemp % iSum == 0)
            return true;
        else 
            return false;
    }
}
