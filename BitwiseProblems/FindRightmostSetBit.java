/*
*   Program to Find Rightmost Set Bit
*/
import java.util.Scanner;
class FindRightmostSetBit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        int pos = 0, n = 0;
        n = num ^ (num & (num - 1));
        // OR 
        //n = num & -num;
        System.out.println(n);
        while( n != 0)
        {
            n = n >> 1;
            ++pos;
        }
        System.out.println("Rightmost bit present at position " + pos);
        sc.close();
    }
}
