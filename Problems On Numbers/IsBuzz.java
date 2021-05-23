/*
    Buzz number is such a number which is divisible by 7 or end with 7
*/

import java.util.Scanner;
public class IsBuzz
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isBuzz(lNum);
        if(b == true)
            System.out.println(lNum + " is Buzz number");
        else
            System.out.println(lNum + " is not Buzz number");
    }

    public static boolean isBuzz(long lNum)
    {
        return ((lNum %  7 == 0) || lNum % 10 == 7);
    }
}
