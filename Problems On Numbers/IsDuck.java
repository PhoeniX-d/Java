/*
    Duck number is another special positive non-zero number that contains zero in it.
    The digit zero should not be presented at the starting of the number.
    Zero can be present at any of the positions except the beginning of the number.
*/

import java.util.Scanner;
public class IsDuck
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isDuck(lNum);
        if(b == true)
            System.out.println(lNum + " is Duck number");
        else
            System.out.println(lNum + " is not Duck number");
    }

    public static boolean isDuck(long lNum)
    {
        if(lNum == 0)
            return false;
        while(lNum > 0)
        {
            if(lNum % 10 == 0)
                break;
            lNum = lNum / 10;
        }
        return (lNum != 0);
    }
}
