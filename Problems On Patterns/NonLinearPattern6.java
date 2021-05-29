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
        nonLinearPattern7(iRow);
        nonLinearPattern8(iRow);
        nonLinearPattern9(iRow);
        nonLinearPattern10(iRow);
        nonLinearPattern11(iRow);
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
                      *         
                    *   *       
                  *       *     
                *           *   
              *               * 
                *           *   
                  *       *     
                    *   *       
                      *        
            
    */
    static void nonLinearPattern6(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 6 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iRange - 1; i++)
        {
            for(int j = 1; j <= iRange - 1; j++)
            {          
                if(i <= iRange / 2)      
                {
                    if(j == (iNum - i + 1) || j == (iNum + i - 1))
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
                    if((j == (i - iNum + 1)) || (j == iNum + (iRange - i - 1)))
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
    Output  : Pascal's Triangle
                          1
                        1   1
                      1   2   1
                    1   3   3   1
                  1   4   6   4   1                        
    */
    static void nonLinearPattern7(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 7 :");
        //int iRange = iNum * 2;
        for (int i = 0; i < iNum; i++) {
            int number = 1;
            System.out.printf("%" + (iNum - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  : Numbers Diamond Pattern
                      1       
                    2 1 2     
                  3 2 1 2 3   
                4 3 2 1 2 3 4 
                  3 2 1 2 3   
                    2 1 2     
                      1        
            
    */
    static void nonLinearPattern8(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 8 :");
        int iRange = iNum * 2, iN = 1;
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {   
                iN = i;
                for(int j = 1; j <= iRange - 1; j++)
                {          
                    if(j >= (iNum - i + 1) && j <= (iNum + i - 1))
                    {    
                        iN = (iN == 0) ? (++iN) : iN;
                        System.out.print(iN + " ");
                        if(j < iRange / 2)
                            iN--;
                        else 
                            iN++;
                    }
                    else
                    {
                        System.out.print("  ");                        
                    }
                }
            }
            else 
            {   
                iN = iRange - i;                
                for(int j = 1; j <= iRange - 1; j++)
                {
                    if((j >= (i - iNum + 1)) && (j <= iNum + (iRange - i - 1)))
                    {
                        iN = (iN == 0) ? (++iN) : iN;
                        System.out.print(iN + " ");
                        if(j < iRange / 2)
                            iN--;
                        else 
                            iN++;
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
    Input   :   5
    Output  :   Binary Square

                1 0 1 0 1 
                0 1 0 1 0 
                1 0 1 0 1 
                0 1 0 1 0 
                1 0 1 0 1
    */
    static void nonLinearPattern9(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("Non Linear Pattern 9:");
        int iN = 0;
        for(int i = 1; i <= iNum; i++)
        {
            if(i % 2 == 0)
            {   
                iN = 0;
                for(int j = 1; j <= iNum; j++)
                {
                    System.out.print(iN + " ");
                    iN = iN == 0 ? 1 : 0;
                }
            }
            else
            {
                iN = 1;
                for(int j = 1; j <= iNum; j++)
                {
                    System.out.print(iN + " ");
                    iN = iN == 0 ? 1 : 0;
                }
            }
            System.out.println();
        }
    }

     /*
    Input   :   5
    Output  :   Number HourGlass
    
               1   2   3   4   5 
                 2   3   4   5   
                   3   4   5     
                     4   5       
                       5         
                     4   5       
                   3   4   5     
                 2   3   4   5   
               1   2   3   4   5
    */
    static void nonLinearPattern10(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("Non Linear Pattern 10:");
        int iRange = iNum * 2;
        for(int i = 1, iN = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)
            {
                iN = i;
                for(int j = 1; j <= iRange - 1; j++)
                {                    
                    if(j >= i && j <= iRange - i && i % 2 == j % 2)
                        System.out.print(iN++ + " ");
                    else
                        System.out.print("  ");
                }
            }
            else
            {
                iN = iRange - i;
                for(int j = 1; j <= iRange - 1; j++)
                {
                    if(j >= (iRange - i) && j <= i && i % 2 == j % 2)
                        System.out.print(iN++ + " ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  : Hollow Diamond
              A
            B   B
          C       C
        D           D
      E               E
    F                   F
      E               E
        D           D
          C       C
            B   B
              A
            
    */
    static void nonLinearPattern11(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("\nNon Linear Pattern 11 :");
        int iRange = iNum * 2;
        char ch = 'A';
        for(int i = 1; i <= iRange - 1; i++)
        {
            if(i <= iRange / 2)      
            {
                for(int j = 1; j <= iRange - 1; j++)
                {                
                    if(j == (iNum - i + 1) || j == (iNum + i - 1))
                    {    
                        System.out.print(ch + " ");
                    }
                    else
                    {
                        System.out.print("  ");                        
                    }
                }
                if(i != iRange / 2)
                    ch++;
            }
            else if(i > iRange / 2)
            {
                --ch;
                for(int j = 1; j <= iRange - 1; j++)
                {                
                    if((j == (i - iNum + 1)) || (j == iNum + (iRange - i - 1)))
                    {
                        System.out.print(ch + " ");
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
