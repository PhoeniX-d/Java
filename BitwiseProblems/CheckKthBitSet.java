/*
*   Program to check K th bit of a number is it set or not
*/
import java.util.Scanner;
class CheckKthBitSet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        System.out.print("\nEnter the position of bit to check set or not\t:");
        int bit = sc.nextInt();

        if(bit > 32 || bit < 1)
        {
            System.out.println("Invalid position of bit");
            System.exit(0);
        }
        
        int res = num & (1 << (bit - 1));
        if(res != 0)
            System.out.println(bit + " th bit is set in " + num);
        else
            System.out.println(bit + " th bit is not set in " + num);
        sc.close();
    }
}
