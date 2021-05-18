/* Program to find power of a number */
import java.util.Scanner;

public class FindPower
{
    public static void main(String[] args)
    {
        float fVal = 0.0f, fRet = 0.0f;
        int iVal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        fVal = sc.nextFloat();
        System.out.print("Enter the power \t= ");
        iVal = sc.nextInt();
        sc.close();
        fRet = power(fVal, iVal);
        System.out.println(iVal + " power of " + fVal + " is " + fRet);
    }
    
    public static float power(float fNum, int iPow)
    {
        float fDiv = fNum, fMult = 1.0f;
        if(iPow == 0)
        {
            return 1.0f;
        }
        else if(iPow > 0)
        {
            for(int i = 1; i <= iPow; i++)
            {
                fMult = fMult * fNum;
            }
            return fMult;
        }
        else
        {
            iPow = -iPow;
            while(iPow >= 0)
            {
                fDiv = fDiv / fNum;
                System.out.println(fDiv);
                iPow--;
            }
            return fDiv;
        }        
    }
}