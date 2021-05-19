/* Program to print even factorial */

import java.util.Scanner;
public class EvenFactorial 
{
    static long fact = 1;
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        long lRet = evenFactorial(iVal);
        System.out.println("Even Factorial is\t= " + lRet);
        evenFactorialRec(iVal);
        System.out.println("Even Factorial is(Recirsive)\t= " + fact);
    }

    public static long evenFactorial(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       long lFact = 1;      
       for(int i = 1; i <= iNum; i++)
       {
            if( i % 2 == 0)
            {
                lFact = lFact * i;
            }
       }
       return lFact;
    }

    public static void evenFactorialRec(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum != 1)
        {
            if(iNum % 2 == 0)
            {
                fact = fact * iNum;
            }
            evenFactorialRec(iNum - 1);
        }
    }
}
