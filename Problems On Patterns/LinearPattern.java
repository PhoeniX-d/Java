/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class LinearPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iNum = 0;
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        iNum = iNum < 0 ? -iNum : iNum;
        displayLinearPattern1(iNum);
        displayLinearPattern2(iNum);
        displayLinearPattern3(iNum);
        displayLinearPattern4(iNum);
        displayLinearPattern5(iNum);
        displayLinearPattern6(iNum);
        displayLinearPattern7(iNum);
    }

    /*
    Input   : 5 
    Output  : A B C D E 
    */
    static void displayLinearPattern1(int iNum)
    {
        char ch = 'A';
        System.out.println("\nLinear Pattern 1:");
        for(int i = 1; i <= iNum; i++)
        {
            System.out.print(ch + " ");
            if(ch == 'Z')
                ch = 'A';
            else
                ch++;
        }
        System.out.println();
    }

    /*
    Input   : 5 
    Output  : 5 # 4 # 3 # 2 # 1 #
    */
    static void displayLinearPattern2(int iNum)
    {
        System.out.println("\nLinear Pattern 2:");
        for(int i = iNum; i >= 1; i--)
        {
            System.out.print(i + " # ");
        }
        System.out.println();
    }

    /*
    Input   : 5 
    Output  : 1 * 2 * 3 * 4 * 5 *
    */
    static void displayLinearPattern3(int iNum)
    {
        System.out.println("\nLinear Pattern 3:");
        for(int i = 1; i <= iNum; i++)
        {
            System.out.print(i + " * ");
        }
        System.out.println();
    }

    /*
    Input   : 4 
    Output  : # 1 * # 2 * # 3 * # 4 * 
    */
    static void displayLinearPattern4(int iNum)
    {
        System.out.println("\nLinear Pattern 4:");
        for(int i = 1; i <= iNum; i++)
        {
            System.out.print("# " + i + " * ");
        }
        System.out.println();
    }

    /*
    Input   : 4 
    Output  : -4 * -3 * -2 * -1 * 0 * 1 * 2 * 3 * 4
    */
    static void displayLinearPattern5(int iNum)
    {
        System.out.println("\nLinear Pattern 5:");
        for(int i = -iNum; i <= iNum; i++)
        {
            System.out.print(i + " * ");
        }
        System.out.println();
    }

    /*
    Input   : 8 
    Output  : 1 * 3 * 5 * 7 *
    */
    static void displayLinearPattern6(int iNum)
    {
        System.out.println("\nLinear Pattern 6:");
        for(int i = 1; i <= iNum; i++)
        {
            if(i % 2 == 0)
                System.out.print("* ");
            else 
                System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    Input   : 4 
    Output  : 1 2 3 4 3 2 1
    */
    static void displayLinearPattern7(int iNum)
    {
        System.out.println("\nLinear Pattern 7:");
        for(int i = 1; i <= iNum; i++)
        {
            System.out.print(i + " ");
        }
        for(int i = iNum - 1; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
