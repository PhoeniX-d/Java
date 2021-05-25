/*
    Write a Java program to classify Abundant, deficient and perfect number (integers) between 1 to 10,000.
    
    In number theory, an abundant number is a number for which the sum of its proper divisors is greater 
    than the number itself. Example: The first few abundant numbers are: 12, 18, 20, 24, 30, 36, 40, 42, 48...
    The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
    
    Deficient number: In number theory, a deficient number is a number n for which the sum of proper divisors 
    (or aliquot sum) s(n)<n. As an example, divisors of 21 are 1, 3 and 7, and their sum is 11.
    Because 11 is less than 21, the number 21 is deficient. Its deficiency is 2 × 21 − 32 = 10.
    The first few deficient numbers are:1, 2, 3, 4, 5, 7, 8, 9, 10…….
    
    Perfect number: In number system, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
    ex 6, 28 etc;
*/

import java.util.ArrayList;

public class ClassifyNumbers
{
    static final int MAX_LIMIT = 10000;
    /*static ArrayList<Integer> perfect = new ArrayList<>();
    static ArrayList<Integer> abundant = new ArrayList<>();
    static ArrayList<Integer> deficient = new ArrayList<>();*/
    public static void main(String[] args)
    {
        System.out.println("Classification of numbers:\n");
        classify(MAX_LIMIT);    
    }

    static void classify(int iMax)
    {
        int iAbundant = 0, iPerfect = 0, iDeficient = 0, iFactorsSum = 0;

        for(int i = 1; i <= iMax; i++)
        {
            iFactorsSum = getFactorSum(i);
            if(iFactorsSum == i)
            {    
               // perfect.add(i);
                iPerfect++;
            }
            else if(iFactorsSum < i)
            {   
               //deficient.add(i);  
                iDeficient++;
            }
            else
            {    
                //abundant.add(i);
                iAbundant++;
            }
        }

        System.out.println("\nTotal Perfect numbers between 1 - 10000 are\t= " + iPerfect + "\n");
        //System.out.println(perfect);
        System.out.println("\nTotal Abundant numbers between 1 - 10000 are\t= " + iAbundant + "\n");
        //System.out.println(abundant);
        System.out.println("\nTotal Deficient numbers between 1 - 10000 are\t= " + iDeficient + "\n");
        //System.out.println(deficient);
    }

    static int getFactorSum(int iNum)
    {
        int iSum = 0, i = 0;
        for(i = iNum / 2; i >= 1; i--)
        {
            if(iNum % i == 0)
            {
                iSum = iSum + i;
            }
        }
        return iSum;
    }
}