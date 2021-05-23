/*
    The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book.
    The ISBN number is a legal number when 
    1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10
    is divisible by 11. The digits are taken from right to left.
    So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
*/

import java.util.Scanner;
public class IsISBN
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isISBN(lNum);
        if(b == true)
            System.out.println(lNum + " is ISBN number");
        else
            System.out.println(lNum + " is not ISBN number");
    }

    public static boolean isISBN(long lNum)
    {
        long lSum = 0;
        int i = 1;
        while(lNum > 0 && i < 11)
        {
            lSum = lSum + (lNum % 10) * i;
            i++;
            lNum = lNum / 10;
        }
        return (lSum % 11 == 0);
    }
}
