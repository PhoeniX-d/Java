/*
*   Program to check whether entered number is power of two or not
*/
import java.util.Scanner;
class CheckPowof2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t\t\t:");
        int num = sc.nextInt();
        System.out.println("\n" + String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0"));
        
        if((num & (num - 1)) == 0)
            System.out.println(num + " is power of 2");
        else
            System.out.println(num + " is not power of 2");
        sc.close();
    }
}
