import java.util.Scanner;

/*
*   Check whether entered numbers are in opposite sign or not
*/
public class CheckOppSign{
    public static void main(String[] args) {
        int iNum1= 0, iNum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1\t:");
        iNum1 = sc.nextInt();
        System.out.print("Enter the number 2\t:");
        iNum2 = sc.nextInt();
        System.out.println(iNum1 + " in binary is\t:" + String.format("%32s", Integer.toBinaryString(iNum1)).replaceAll(" ", "0"));
        System.out.println(iNum2 + " in binary is\t:" + String.format("%32s", Integer.toBinaryString(iNum2)).replaceAll(" ", "0"));
        if((iNum1 ^ iNum2) < 0)
            System.out.println(iNum1 + " and " + iNum2 + " are in opposite sign");
        else
        System.out.println(iNum1 + " and " + iNum2 + " are in opposite sign");
        sc.close();
    }
}
