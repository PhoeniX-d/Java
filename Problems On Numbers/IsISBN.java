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
        String lNum = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLine();
        sc.close();
        boolean b = isISBN(lNum);
        if(b == true)
            System.out.println(lNum + " is ISBN number");
        else
            System.out.println(lNum + " is not ISBN number");
    }

    public static boolean isISBN(String isbn)
    {
        int iSum = 0, iDig = 0;
        if(isbn.length() != 10)
            return false;

        for(int i = 0; i < 9; i++)
        {
            iDig = isbn.charAt(i) - '0';
            if(iDig >= 0 && iDig <= 9)
            {
                iSum = iSum + (iDig * (10 - i));
            }
        }
        
        char last = isbn.charAt(9);        
        iDig = (last == 'X') ? 10 : last - '0';
        iSum = iSum + iDig;
        return (iSum % 11 == 0);        
    }
}
