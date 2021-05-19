/* Program to print factorial */

import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        long lRet = factorial(iVal);
        System.out.println("Factorial is\t= " + lRet);
        fact = factorialRec(iVal);
        System.out.println("Factorial is\t= " + fact);
    }

    public static long factorial(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       long lFact = 1;      
       for(int i = 1; i <= iNum; i++)
       {
            lFact = lFact * i;
       }
       return lFact;
    }

    public static long factorialRec(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum != 1)
        {
            return iNum * factorialRec(iNum - 1);
        }
        else
            return 1;
    }
}
