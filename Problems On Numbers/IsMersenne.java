/*
    In mathematics, a Mersenne prime number is a number that can be written in the form M(n) = 2n − 1
    for some integer n. The first four Mersenne primes are 3, 7, 31, and 127
*/

import java.util.Scanner;
public class IsMersenne
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isMersenne(lNum);
        if(b == true)
            System.out.println(lNum + " is Mersenne number");
        else
            System.out.println(lNum + " is not Mersenne number");
    }

    public static boolean isMersenne(long lNum)
    {
        long lMersenne = 0l;
        int i = 0;
        for(i = 0; i < 100; i++)
        {
            lMersenne = (long)(Math.pow(2, i)) - 1;
            if(lMersenne == lNum)
            {
                break;
            }
        }
        if(lMersenne == lNum)
            return true;
        else return false;
    }
}
