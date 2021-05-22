/*
    A positive n digit number X is called a Keith number (or repfigit number) if it is arranged 
    in a special number sequence generated using its digits. The special sequence has first n terms 
    as digits of x and other terms are recursively evaluated as the sum of previous n terms. 
    For example, 197, 19, 742, 1537, etc.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class IsKeith
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isKeith(iNum);
        if(b == true)
            System.out.println(iNum + " is Keith number");
        else
            System.out.println(iNum + " is not Keith number");
    }

    public static boolean isKeith(int iNum)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int iTemp = iNum, iDigs = 0;
        while(iTemp > 0)
        {
            nums.add(iTemp % 10);
            iDigs++;
            iTemp = iTemp / 10;
        }
        Collections.reverse(nums);
        int iNext = 0, i = iDigs;
        while(iNext < iNum)
        {
            iNext = 0;
            for(int j = 1; j <= iDigs; j++)
                iNext = iNext + nums.get(i - j);
            nums.add(iNext);
            i++;   
        }
        return (iNext == iNum);
    }
}
