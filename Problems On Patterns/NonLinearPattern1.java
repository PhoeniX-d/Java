/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class NonLinearPattern1
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
        nonLinearPattern6(iRow, iCol);
        nonLinearPattern7(iRow, iCol);
        nonLinearPattern8(iRow, iCol);
        nonLinearPattern9(iRow, iCol);
        nonLinearPattern10(iRow, iCol);
        nonLinearPattern11(iRow, iCol);
    }

    /*
    Input   : 4 4
    Output  : 1 2 3 4
              1 2 3 4
              1 2 3 4
              1 2 3 4  
    */
    static void nonLinearPattern1(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 1:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    Input   : 3 4
    Output  : * * * *
              * * * *
              * * * *            
    */
    static void nonLinearPattern2(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 2:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 3 iCol = 4 
    Output  : * # * # 
              * # * # 
              * # * #
    */
    static void nonLinearPattern3(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 3:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j % 2 == 0)
                    System.out.print("# ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : 1 1 1 1
              2 2 2 2
              3 3 3 3
              4 4 4 4  
    */
    static void nonLinearPattern4(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 4:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : A B C D
              A B C D
              A B C D
              A B C D 
    */
    static void nonLinearPattern5(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        char ch = 'A';
        System.out.println("\nNon Linear Pattern 5:");
        for(int i = 1; i <= iRow; i++)
        {
            ch = 'A';
            for(int j = 1; j <= iCol; j++, ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : A B C D
              a b c d
              A B C D
              a b c d 
    */
    static void nonLinearPattern6(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        char ch = 'A';
        System.out.println("\nNon Linear Pattern 6:");
        for(int i = 1; i <= iRow; i++)
        {
            ch = 'A';
            for(int j = 1; j <= iCol; j++, ch++)
            {
                if(i % 2 == 0)
                    System.out.print((char)(ch + 32) + " ");
                else 
                    System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 3 iCol = 4 
    Output  : 1  2  3  4 
              5  6  7  8 
              9 10 11 12 
    */
    static void nonLinearPattern7(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        int iNum = 1;
        System.out.println("\nNon Linear Pattern 7:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++, iNum++)
            { 
                System.out.printf("%2d ", iNum);
            }
            System.out.println();
        }
    }

    /*
    Input   : iRow = 3 iCol = 4 
    Output  : 1  2  3  4 
              5  6  7  8 
              9 10 11 12 
    */
    static void nonLinearPattern8(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        int iNum = 1;
        System.out.println("\nNon Linear Pattern 8:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++, iNum++)
            {
                if(iNum == 10)
                    iNum = 1;
                System.out.printf("%2d ", iNum);
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : 2 4 6 8
              1 3 5 7
              2 4 6 8
              1 3 5 7  
    */
    static void nonLinearPattern9(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 9:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i % 2 != 0)
                    System.out.printf("%2d ", j * 2);
                else 
                    System.out.printf("%2d ", (j * 2 - 1));
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : a b c d
              1 2 3 4
              a b c d
              1 2 3 4 
    */
    static void nonLinearPattern10(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        char ch = 'a';
        System.out.println("\nNon Linear Pattern 9:");
        for(int i = 1; i <= iRow; i++)
        {
            ch = 'a';
            for(int j = 1; j <= iCol; j++, ch++)
            {
                if(i % 2 != 0)
                    System.out.printf("%2c ", ch);
                else 
                    System.out.printf("%2d ", j);
            }
            System.out.println();
        }
    }

    /*
    Input   : 4 4
    Output  : 1 2 3 4
              2 3 4 5
              3 4 5 6
              4 5 6 7 
    */
    static void nonLinearPattern11(int iRow, int iCol)
    {
        // updaters
        iRow = iRow < 0 ? -iRow : iRow;
        iCol = iCol < 0 ? -iCol : iCol;
        System.out.println("\nNon Linear Pattern 9:");
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.printf("%2d ", ( i + j - 1));
            }
            System.out.println();
        }
    }
}
