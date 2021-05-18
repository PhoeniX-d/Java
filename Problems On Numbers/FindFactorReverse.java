/* Program to find factors of a number in reverse order*/

import java.util.Scanner;
public class FindFactorReverse 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
       
        if(iVal == 0)
        {
            System.out.print("Cannot find factors of zero!!");
            System.exit(0);
        }
        sc.close();
        factorsOf(iVal);
    }

    public static void factorsOf(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       boolean flag = false;
       System.out.println("Factors are");
       for(int i = iNum / 2; i >= 1; i--)
       {
            if(iNum % i == 0)
            {
                System.out.print(i + " ");
                flag = true;
            }
       }
       if(flag == false)
       {
            if(iNum == 1)
            {
                System.out.print(iNum);
            }
            else
            {
                System.out.print(iNum + " 1");
            }
       }
    }
}
