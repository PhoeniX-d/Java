import java.util.*;

public class ReverseWordbyK
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        if(str.isEmpty())
            System.out.println("NULL");
        if(n == str.length())
        {
            String []sarr = str.split("\\s");
            System.out.println("Enter k");
            int k = sc.nextInt();
            if(k == 0)
            {
                System.out.println(str);
            }
            else if(k <= (sarr.length))
            {
                String []res = new String[sarr.length];
                          
                for(int i = sarr.length - 1, x = 0; i >= 0; i--)
                {
                    x = i - k;
                    if(x < 0)
                    {
                        x = sarr.length + x;
                    }
                    res[x] = sarr[i];
                }
                for(int i = 0; i < res.length; i++)
                {
                    System.out.print(res[i] + " ");
                }
            }
        }        
    }
}

