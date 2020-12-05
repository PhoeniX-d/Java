import java.util.Scanner;
import java.io.*;

class FibonacciSeries
{
    public void displayFibonacci(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        long i = 0, iFirst = 0, iSecond = 1, iThird = 0;
        for(i = 1; i <= iNo; i++)
        {
            System.out.println(iFirst);
            iThird = iFirst + iSecond;
            iFirst = iSecond;
            iSecond = iThird;
        }
        System.out.println();
    }
}

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sObj.nextInt();
        FibonacciSeries fs = new FibonacciSeries();
        fs.displayFibonacci(iNo);
        sObj.close();
    }
}
