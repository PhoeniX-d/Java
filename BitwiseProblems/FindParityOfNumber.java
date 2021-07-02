/*
*   Program to find position of only set bit of a number
*/
import java.util.Scanner;
class FindParityOfNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        num = num < 0 ? -num : num;
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        boolean parity = false;
        while(num != 0)
        {
            /*
            if((num & 1) == 1)
                count++;
            num = num >> 1;
            */

            /* Approach 2 By Brian Karnighan's Bit Counting */
            parity = !parity;
            num = num & (num - 1);
        }
        if(parity)
            System.out.println("Number has odd parity");
        else
            System.out.println("Number has even parity");
        sc.close();
    }
}
