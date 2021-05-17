/* Program to check 2nd no is factor of 1st or not */

import java.util.Scanner;
public class FindFactor 
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
       for(int i = 2; i <= iNum / 2; i++)
       {
            if(iNum % i == 0)
            {
                System.out.print(i + " ");
                flag = true;
            }
       }
       if(flag == false)
       {
           System.out.print("1 " + iNum);
       }
    }
}
