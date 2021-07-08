/*
*   Write java program which accept marks of N students from user
*   and display class of each student.
*   Less than 35 - Fail
*   Less than 50 - Pass class
*   Less than 60 - Second class
*   Less than 70 - First class
*   Greater than 70 - First class with Distinction 
*/

import java.util.Scanner;

class Percentage {
    public void getRemarks(float fMarks[]) {
        int i = 0;
        for(i = 0; i < fMarks.length; i++)
        {
            if (fMarks[i] > 100)
            {
                System.out.println("Enter valid marks in percentage");
                break;
            }
            if(fMarks[i] < 35)
            {
                System.out.println(fMarks[i] + "\t:Fail");
            }
            else if(fMarks[i] < 50 && fMarks[i] >= 35)
            {
                System.out.println(fMarks[i] + "\t:Pass class");
            }
            else if(fMarks[i] < 60 && fMarks[i] >= 50)
            {
                System.out.println(fMarks[i] + "\t:Second class");
            }
            else if(fMarks[i] < 70 && fMarks[i] >= 60)
            {
                System.out.println(fMarks[i] + "\t:First Class");
            }
            else if(fMarks[i] >= 70)
            {
                System.out.println(fMarks[i] + "\t:First Class with Distinction");
            }
        }
    }
}

class StudentMarks {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int i = 0;
        System.out.printf("Enter the total number of elements in Array\t:");
        int iValue = sObj.nextInt();
        float fMarks[] = new float[iValue];
        System.out.printf("Enter the elements:\n");
        for (i = 0; i < fMarks.length; i++) {
            fMarks[i] = sObj.nextFloat();
        }

        sObj.close();
        Percentage pObj = new Percentage();
        System.out.println("Students Remarks:");
        pObj.getRemarks(fMarks);
    }
}
