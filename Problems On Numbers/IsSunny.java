/*
    A number is called a sunny number if the number next to the given number is a perfect square.
    In other words, a number N will be a sunny number if N+1 is a perfect square.
*/

import java.util.Scanner;
public class IsSunny
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();

        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isSunny(lNum);
        if(b == true)
            System.out.println(lNum + " is Sunny number");
        else
            System.out.println(lNum + " is not Sunny number");
    }

    public static boolean isSunny(long lNum)
    {
        return (Math.sqrt(lNum + 1) - Math.floor(Math.sqrt(lNum + 1)) == 0);
    }
}
