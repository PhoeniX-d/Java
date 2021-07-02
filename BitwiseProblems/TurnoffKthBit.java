/*
*   Program to turn off K th bit of a number
*/
import java.util.Scanner;
class TurnoffKthBit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        System.out.print("\nEnter the position of bit to turn off\t:");
        int bit = sc.nextInt();

        if(bit > 32 || bit < 1)
        {
            System.out.println("Invalid position of bit");
            System.exit(0);
        }
        
        int res = num & ~(1 << (bit - 1));
        System.out.println(num + " After turning off bit " + bit + " it becomes " + res);
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(res)).replaceAll(" ", "0"));

        sc.close();
    }
}
