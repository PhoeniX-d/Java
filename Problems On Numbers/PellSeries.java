/*
    In mathematics, the Pell numbers are an infinite sequence of integers.
    The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice
    the previous Pell number and the Pell number before that.:
    thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
*/

import java.util.Scanner;
public class PellSeries
{
    static int f = 0, s = 1, t = 0;
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("Looping");
        if(iNum <= 1)
            System.out.print("0 ");
        else
            System.out.print("0 1 ");
        displayFibonacci(iNum);

        System.out.println("\nRecursion");
        if(iNum <= 1)
        {
            System.out.print("0 ");
            displayFibonacciRec(iNum - 1);
        }
        else
        {
            System.out.print("0 1 ");
            displayFibonacciRec(iNum - 2);
        }
        
    }

    public static void displayFibonacci(int iNum)
    {
       // iNum = iNum < 0 ? -iNum : iNum;
        int first = 0, second = 1, third = 0;
        for(int i = 2; i < iNum; i++)
        {
           third = first + 2 * second;
           System.out.print(third + " ");
           first = second;
           second = third;
        }
    }

    public static void displayFibonacciRec(int iNum)
    {        
        if(iNum > 0)
        {
            t = f + s * 2;
            System.out.print(t + " ");
            f = s;
            s = t;            
            displayFibonacciRec(iNum - 1);
        }
    }
}