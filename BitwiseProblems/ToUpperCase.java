/*
*   Program to convert characters into upper case
*/
import java.util.Scanner;
class ToUpperCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String\t\t\t:");
        String str = sc.nextLine();
        char cArr[] = str.toCharArray();
        for(int i = 0; i < cArr.length;i++)
        {
            cArr[i] = (char)(cArr[i] & '_');
        }
        System.out.println("Converted string\t\t\t:" + new String(cArr));
        sc.close();
    }
}
