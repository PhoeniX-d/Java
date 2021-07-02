/*
*   Program to find position of only set bit of a number
*/
import java.util.Scanner;
class FindOnlySetBitPos
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        num = num < 0 ? -num : num;
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        if((num & (num - 1)) != 0)
            System.out.println("Number has more than one bit set");
        else
        {
            int pos = 1;
            while(num > 1)
            {
                num = num >> 1;
                pos++;
            }
            System.out.println("Position of set bit is " + pos);
        }
        sc.close();
    }
}
