/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class NonLinearPattern6
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
        //nonLinearPattern7(iRow);*/
    }

    /*
    Input   : 5
    Output  : Right  Triangle Pascal’s     
                    * 
                    * * 
                    * * * 
                    * * * * 
                    * * * * * 
                    * * * * 
                    * * * 
                    * * 
                    * 
    */
    static void nonLinearPattern1(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 1 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int j = 1; j <= iRange - i; j++)
                {
                    System.out.print("* ");
                }
            }            
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  : Left  Triangle Pascal’s  
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
                  * * * *
                    * * *
                      * *
                        *
    */
    static void nonLinearPattern2(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 2 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                for(int j = 1; j <= iNum; j++)
                {
                    if(j > iNum - i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            else
            {
                for(int j = 1; j <= iNum; j++)
                {
                    if(j > i - iNum)
                        System.out.print("* ");
                    else 
                        System.out.print("  ");
                }
            }            
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  : Sandglass star pattern  
                *   *   *   *   *
                  *   *   *   *
                    *   *   *
                      *   *
                        *
                      *   *
                    *   *   *
                  *   *   *   *
                *   *   *   *   *
    */
    static void nonLinearPattern3(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 3 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                for(int j = 1; j <= iRange - 1; j++)
                {
                    if(j >= i && j <= (iRange - i) && i % 2 == j % 2)
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
                    if((j >= iRange - i) && (j <= i) && i % 2 == j % 2)
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
    Output  : Hollow up triangle
                     *
                   *   *
                 *       *   
               *           *
             * * * * * * * * * 
    */
    static void nonLinearPattern4(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 4 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iRange - 1; j++)
            {                
                if((j == (iNum - i + 1)) || (j == (iNum + i - 1)) || i == iNum)
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
    Output  : Hollow down triangle
  
               * * * * * * * * * 
                 *           *
                   *       *
                     *   *
                       *
    */
    static void nonLinearPattern5(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 5 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iRange - 1; j++)
            {                
                if(j == i || j == (iRange - i) || i == 1)
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
    Output  : Hollow Diamond
  
               * * * * * * * * * 
                 *           *
                   *       *
                     *   *
                       *
    */
    static void nonLinearPattern6(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 5 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            for(int j = 1; j <= iRange - 1; j++)
            {          
                if(i <= iRange / 2)      
                {
                    if(j == i || j == (iRange - i))
                    {    
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");                        
                    }
                }
                else if(i > iRange / 2)
                {
                    if((j == (iNum - i + 1)) || (j == (iNum + i - 1)))
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
}
