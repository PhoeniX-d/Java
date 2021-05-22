/*
    In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
    The first two numbers of fibonacci series are 0 and 1.
*/

import java.util.Scanner;
public class Fibonacci
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
        displayFibonacci(iNum);
        System.out.println("\nRecursion");
        displayFibonacciRec(iNum);
    }

    public static void displayFibonacci(int iNum)
    {
       // iNum = iNum < 0 ? -iNum : iNum;
        int first = 0, second = 1, third = 0;
        for(int i = 1; i <= iNum; i++)
        {
            System.out.print(third + " ");
            first = second;
            second = third;
            third = first + second;
        }
    }

    public static void displayFibonacciRec(int iNum)
    {        
        if(iNum > 0)
        {
            System.out.print(t + " ");
            f = s;
            s = t;
            t = f + s;
            displayFibonacciRec(iNum - 1);
        }
    }
}