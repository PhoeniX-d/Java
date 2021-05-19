/* Program to print odd factorial */

import java.util.Scanner;
public class OddFactorial 
{
    static long fact = 1;
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        long lRet = oddFactorial(iVal);
        System.out.println("Odd Factorial is\t= " + lRet);
        oddFactorialRec(iVal);
        System.out.println("Odd Factorial is(Recirsive)\t= " + fact);
    }

    public static long oddFactorial(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       long lFact = 1;      
       for(int i = 1; i <= iNum; i++)
       {
            if( i % 2 != 0)
            {
                lFact = lFact * i;
            }
       }
       return lFact;
    }

    public static void oddFactorialRec(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum != 1)
        {
            if(iNum % 2 != 0)
            {
                fact = fact * iNum;
            }
            oddFactorialRec(iNum - 1);
        }
    }
}
