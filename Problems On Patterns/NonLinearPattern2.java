/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class NonLinearPattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iRow = 0, iCol = 0;
        System.out.print("Enter the Row number\t= ");
        iRow = sc.nextInt();
        System.out.print("Enter the Col number\t= ");
        iCol = sc.nextInt();
        sc.close();
        nonLinearPattern1(iRow, iCol);
        nonLinearPattern2(iRow, iCol);
        nonLinearPattern3(iRow, iCol);
        nonLinearPattern4(iRow, iCol);
        nonLinearPattern5(iRow, iCol);
    }

    /*
    Input   : iRow = 4 iCol = 4 
    Output  : * # # # 
              * * # # 
              * * * # 
              * * * *
    */
    static void nonLinearPattern1(int iRow, int iCol)
    {
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        if(iRow != iCol)
        {
            System.out.println("Please enter equal number of rows and columns!!");
            return;
        }
        System.out.println("\nNon Linear Pattern 1 :");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j <= i)
                    System.out.print("* ");
                else 
                    System.out.print("# ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 4 iCol = 4 
    Output  : * * * *
              * * * #
              * * # #
              * # # #
    */
    static void nonLinearPattern2(int iRow, int iCol)
    {
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        if(iRow != iCol)
        {
            System.out.println("Please enter equal number of rows and columns!!");
            return;
        }
        System.out.println("\nNon Linear Pattern 2 :");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j - 1 <= iCol - i)
                    System.out.print("* ");
                else 
                    System.out.print("# ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 5 iCol = 5 
    Output  : $ * * * * 
              * $ * * * 
              * * $ * * 
              * * * $ * 
              * * * * $
    */
    static void nonLinearPattern3(int iRow, int iCol)
    {
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        if(iRow != iCol)
        {
            System.out.println("Please enter equal number of rows and columns!!");
            return;
        }
        System.out.println("\nNon Linear Pattern 3 :");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == j)
                    System.out.print("$ ");
                else 
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 6 iCol = 5 
    Output  : * * * * * 
              * @ @ @ * 
              * @ @ @ * 
              * @ @ @ * 
              * @ @ @ * 
              * * * * * 
    */
    static void nonLinearPattern4(int iRow, int iCol)
    {
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        if(iRow != iCol)
        {
            System.out.println("Please enter equal number of rows and columns!!");
            return;
        }
        System.out.println("\nNon Linear Pattern 4 :");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                    System.out.print("* ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 4 iCol = 4 
    Output  : 1 2 3 4 
              1 * * 4
              1 * * 4
              1 2 3 4
    */
    static void nonLinearPattern5(int iRow, int iCol)
    {
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        if(iRow != iCol)
        {
            System.out.println("Please enter equal number of rows and columns!!");
            return;
        }
        System.out.println("\nNon Linear Pattern 5 :");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                    System.out.print(j + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
