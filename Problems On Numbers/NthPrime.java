/* Program to find whether number is Prime or not */

import java.util.ArrayList;
import java.util.Scanner;
public class NthPrime
{
    static ArrayList<Integer> al = new ArrayList<>();
    static final int MAX_VAL = 1000;
    public static void main(String[] args) 
    {
        getPrimes(MAX_VAL);
        System.out.println("Enter the number between 1 -1000");
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        sc.close();
        if(iVal < 0 || iVal > 1000)
            System.out.println("Out of range");
        System.out.println(iVal + " th Prime number is\t= " + al.get(iVal - 1));    
    }

    static void getPrimes(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        int i = 2;
        while(iNum > 0)
        {
            if(isPrime(i))
            {
                al.add(i);
                iNum--;
            }
            i++;
        }
    }
    public static boolean isPrime(int iNum)
    {       
        if(iNum == 0)
        {
            return false;
        }
        int i = 0;
        for(i = iNum / 2; i > 1; i--)
        {
            if(iNum % i == 0)
            {
                break;
            }
        }        
        return (i == 1 || iNum == 1 || iNum == -1);
    }
}
