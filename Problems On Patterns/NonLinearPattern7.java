/*
    Accept number from user and display below pattern.   
*/
import java.util.Scanner;
public class NonLinearPattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iRow = 0; //iCol = 0;
        System.out.print("Enter the number\t= ");
        iRow = sc.nextInt();
       
        nonLinearPattern1(iRow);
        nonLinearPattern2(iRow);
        System.out.print("Enter the character\t= ");
        char ch = sc.next().charAt(0);
        sc.close();
        nonLinearPattern3(ch);
    }

    /*
    Input   : 5
    Output  :
            *                 *
            * *             * *
            * * *         * * *
            * * * *     * * * *
            * * * * * * * * * *
    */
    static void nonLinearPattern1(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("Non-Linear pattern 1 :");
        int iRange = iNum * 2;
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iRange; j++)
            {
                if(j <= i || j >= iRange - i + 1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*
    Input   : 5
    Output  :
            A B C D E E D C B A
            A B C D     D C B A
            A B C         C B A
            A B             B A
            A                 A
    */
    static void nonLinearPattern2(int iNum)
    {
        iNum = iNum < 0 ? -iNum : iNum;
        System.out.println("Non-Linear pattern 1 :");
        int iRange = iNum * 2;
        char ch = 'A';
        for(int i = 1; i <= iNum; i++)
        {
            for(int j = 1; j <= iRange; j++)
            {
                if(j <= iNum - i + 1 || j > iNum + i - 1)
                {
                    if(j <= iRange / 2)
                        System.out.print(ch++ + " ");
                    else
                        System.out.print(--ch + " "); 
                }
                else 
                    System.out.print("  ");
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
    static void nonLinearPattern3(char character)
    {
        int iNum = character - 'A' + 1;
        System.out.println("\nNon Linear Pattern 3 :");
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