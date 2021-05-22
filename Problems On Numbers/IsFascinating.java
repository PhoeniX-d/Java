/*
    The number obtained by multiplying a number by two and three separately and will be called 
    a fascinating number if the result obtained after concatenation of resultant number and original
    number contains all digits from 1 to 9, exactly once.
*/

import java.util.Scanner;
public class IsFascinating
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isFascinating(iNum);
        if(b == true)
            System.out.println(iNum + " is Fascinating number");
        else
            System.out.println(iNum + " is not Fascinating number");
    }

    public static boolean isFascinating(int iNum)
    {
        if(Integer.toString(iNum).length() < 3)
            return false;

        long lN1 = iNum * 2, lN2 = iNum * 3;
        int k = 0, index = 0;    
        String s = iNum + "" + lN1 + lN2;
        System.out.println(s);

        byte[] b = new byte[10];
        for(int i = 0; i < s.length(); i++)
        {
            index = s.charAt(i) - '0';
            if(index == 0)
                continue;
            b[index]++;
            if(b[index] > 1)
                break;
        }

        for(k = 1; k < b.length; k++)
        {
            if(b[k] == 0 || b[k] > 1)
                break;
        }

        if(k == b.length)
            return true;
        else
            return false;
    }
}
