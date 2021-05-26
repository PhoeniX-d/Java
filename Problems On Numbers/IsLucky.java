/*
    Lucky number is such a number in which all digits are different
*/

import java.util.Scanner;
public class IsLucky
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        
        lNum = lNum < 0 ? -lNum : lNum;
        for(int i = 0; lNum > 0; i++)
        {
            if(isLucky(i))
            {
                System.out.print(i + " ");
                lNum--;
            }
        }
        /*
        boolean b = isLucky(lNum);
        if(b == true)
            System.out.println(lNum + " is Lucky number");
        else
            System.out.println(lNum + " is not Lucky number");
        */
    }

    public static boolean isLucky(long lNum)
    {
        boolean[] b = new boolean[10];
        for(int i = 0; i < 10; i++)
            b[i] = false;
        
        int iDig = 0;
        while(lNum > 0)
        {
            iDig = (int)(lNum % 10);
            if(b[iDig])
                break;
            b[iDig] = true;
            lNum = lNum / 10;
        }
        if(lNum == 0)
            return true;
        else 
            return false;
    }
}
