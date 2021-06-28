import java.util.Scanner;

/*
*   Check whether entered number is even or odd using bitwse operators
*/
public class CheckEvenOdd{
    public static void main(String[] args) {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t:");
        iNum = sc.nextInt();
        if((0x00000001 & iNum) == 0)
            System.out.println(iNum + " is even number");
        else
            System.out.println(iNum + " is odd number");
        sc.close();
    }
}
