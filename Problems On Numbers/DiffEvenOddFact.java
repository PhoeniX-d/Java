/* Program to print diiference between even and odd factorial */

import java.util.Scanner;
public class DiffEvenOddFact 
{
    static long efact = 1, ofact = 1;
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        long lRet = diffEvenOddFact(iVal);
        System.out.println("Even Factorial is\t= " + lRet);
        diffEvenOddFactRec(iVal);
        System.out.println("Even Factorial is(Recirsive)\t= " + (efact - ofact));
    }

    public static long diffEvenOddFact(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       long lEFact = 1, lOFact = 1;      
       for(int i = 1; i <= iNum; i++)
       {
            if( i % 2 == 0)
            {
                lEFact = lEFact * i;
            }
            else
            {
                lOFact = lOFact * i;
            }
       }
       return lEFact - lOFact;
    }

    public static void diffEvenOddFactRec(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        if(iNum != 1)
        {
            if( iNum % 2 == 0)
            {
                efact = efact * iNum;
            }
            else
            {
                ofact = ofact * iNum;
            }
            diffEvenOddFactRec(iNum - 1);
        }
    }
}
