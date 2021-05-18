/* Program to print that number of even numbers */

import java.util.Scanner;
public class FindEvens 
{
    public static void main(String[] args) 
    {
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number\t= ");
        iVal = sc.nextInt();
        sc.close();
        evens(iVal);
    }

    public static void evens(int iNum)
    {
       iNum = iNum < 0 ? -iNum : iNum;
       System.out.println("Even numbers are");
       for(int i = 2; iNum > 0; i++)
       {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
                iNum--;
            }
       }
    }
}
