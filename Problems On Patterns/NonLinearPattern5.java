/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class NonLinearPattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iRow = 0; //iCol = 0;
        System.out.print("Enter the number\t= ");
        iRow = sc.nextInt();
        /*System.out.print("Enter the Col number\t= ");
        iCol = sc.nextInt();*/
        sc.close();
        nonLinearPattern1(iRow);
        nonLinearPattern2(iRow);
        nonLinearPattern3(iRow);
        nonLinearPattern4(iRow);
        nonLinearPattern5(iRow);
        nonLinearPattern6(iRow);
        nonLinearPattern7(iRow);
    }

    /*
    Input   : 5
    Output  :        *
                   *   *
                 *   *   *   
               *   *   *   *
             *   *   *   *   * 
    */
    static void nonLinearPattern1(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iNum * 2 - 1; j++)
            {
                if(j >= iNum - i + 1 && j <= iNum + i - 1)
                {
                    if(i % 2 == j % 2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  :        *
                   * * *
                 * * * * *   
               * * * * * * *
             * * * * * * * * * 
    */
    static void nonLinearPattern2(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iNum * 2 - 1; j++)
            {
                if(j >= iNum - i + 1 && j <= iNum + i - 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  :        * 
                   * * 
                 * * * 
               * * * * 
             * * * * *
    */
    static void nonLinearPattern3(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iNum; j++)
            {
                if(j >= iNum - i + 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  :        *
                   * * *
                 * * * * *   
               * * * * * * *
             * * * * * * * * * 
               * * * * * * *
                 * * * * *
                   * * * 
                     *
    */
    static void nonLinearPattern4(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                for(int j = 1; j <= iRange - 1; j++)
                {                
                    if((j >= iNum - i + 1) && (j <= iNum + i - 1))
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");                        
                    }
                }
            }
            else
            {
                for(int j = 1; j <= iRange - 1; j++)
                { 
                    if((j > i - iNum) && j < iRange - (i - iNum))
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  :        *
                   *   *
                 *   *   *   
               *   *   *   *
             *   *   *   *   * 
               *   *   *   *
                 *   *   *
                   *   * 
                     *
    */
    static void nonLinearPattern5(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                for(int j = 1; j <= iRange - 1; j++)
                {                
                    if((j >= iNum - i + 1) && (j <= iNum + i - 1) && i % 2 == j % 2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");                        
                    }
                }
            }
            else
            {
                for(int j = 1; j <= iRange - 1; j++)
                { 
                    if((j > i - iNum) && j < iRange - (i - iNum) && i % 2 == j % 2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    /*
    Input   : 5
    Output  :  
            *   *   *   *   * 
              *   *   *   *   
                *   *   *     
                  *   *       
                    *         
    */
    static void nonLinearPattern6(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 6 :");
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iNum * 2 - 1; j++)
            {
                if(j >= i && j <= iNum * 2 - i)
                {
                    if(i % 2 == j % 2)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

     /*
    Input   : 5
    Output  :  
             * * * * * * * * * 
               * * * * * * *
                 * * * * *
                   * * * 
                     *        
    */
    static void nonLinearPattern7(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 6 :");
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iNum * 2 - 1; j++)
            {
                if(j >= i && j <= iNum * 2 - i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
