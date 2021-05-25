/*
    In Lucas series, next number is the sum of previous two numbers for example 2, 1, 3, 4, 7, 11, 18, 29.... etc. 
    The first two numbers of Lucas series are 2 and 1.
*/

import java.util.Scanner;
public class Lucas
{
    static int f = 2, s = 1, t = 0;
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();
        iNum = iNum < 0 ? -iNum : iNum;
        //System.out.println("Looping");
        if(iNum <= 1)
        {
            System.out.print("2 ");
        }
        else
        {
            System.out.print("2 1 ");
        }
        //displayLucas(iNum);
        //System.out.println("\nRecursion");
        displayLucasRec(iNum - 2);
    }

    public static void displayLucas(int iNum)
    {
       // iNum = iNum < 0 ? -iNum : iNum;
        int first = 2, second = 1, third = 0;
        for(int i = 2; i < iNum; i++)
        {
            third = second;
            second = first + second;
            first = third;
            System.out.print(second + " ");
        }
    }

    public static void displayLucasRec(int iNum)
    {        
        if(iNum > 0)
        {
            t = s;
            s = f + s;
            f = t;
            System.out.print(s + " ");
            displayLucasRec(iNum - 1);
        }
    }
}