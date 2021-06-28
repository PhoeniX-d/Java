import java.util.Scanner;

/*
*   Add 1 to given integer number using bitwise operators
*/
public class AddOneToInt{
    public static void main(String[] args) {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t:");
        iNum = sc.nextInt();
        System.out.println(iNum + " + 1 is " + (-~iNum));
        sc.close();
    }
}
