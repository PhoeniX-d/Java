/*
*   Program to turn off rightmost bit of a number
*/
import java.util.Scanner;
class TurnoffRightmostBit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        
        int res = num & (num - 1);
        System.out.println(num + " After turning off rightmost bit it becomes " + res);
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(res)).replaceAll(" ", "0"));

        sc.close();
    }
}
