import java.util.Scanner;

/*
*   Swap two numbers without using any third variable
*/
public class SwapOfTwoNums{
    public static void main(String[] args) {
        int iNum1= 0, iNum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1\t:");
        iNum1 = sc.nextInt();
        System.out.print("Enter the number 2\t:");
        iNum2 = sc.nextInt();
        System.out.println("\nBefore Swapping iNum1 = " + iNum1 + " iNum2 = " + iNum2);
        if(iNum1 != iNum2)
        {
            iNum1 = iNum1 ^ iNum2;
            iNum2 = iNum1 ^ iNum2;
            iNum1 = iNum1 ^ iNum2;
        }
        System.out.println("After Swapping iNum1 = " + iNum1 + " iNum2 = " + iNum2);
        sc.close();
    }
}
