/*
    Program to find perfect cube or not
*/

import java.util.Scanner;

public class IsPerfectCube
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isPerfectCube(lNum);
        if(b == true)
            System.out.println(lNum + " is a perfect cube number");
        else
            System.out.println(lNum + " is not a perfect cube number");
    }

    public static boolean isPerfectCube(long lNum)
    {
        int iCubeRoot = (int)(Math.round(Math.pow(lNum, 1.0 / 3.0)));
        return (lNum == (iCubeRoot * iCubeRoot * iCubeRoot));
    }
}
