import java.util.*;
import java.io.*;

class StackDemo
{
    public static void main(String[] args) throws Exception 
    {
        Stack<Integer> s = new Stack<Integer>();
        int choice = 0, pos, ele;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(choice < 4)
        {
            System.out.println("Stack Operations");
            System.out.println("1 Push an element");
            System.out.println("2 Pop an element");
            System.out.println("3 Search an element");
            System.out.println("Your choice");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the element");
                    ele = Integer.parseInt(br.readLine());
                    s.push(ele);
                    break;

                case 2:
                    if(s.empty() == true)
                    {
                        System.out.println("Cannot pop stack is empty");
                        break;
                    }
                    Integer obj = s.pop();
                    System.out.println("Popped = " + obj);
                    break;

                case 3:
                    System.out.println("Which element?");
                    ele = Integer.parseInt(br.readLine());
                    pos = s.search(ele);
                    if (pos == -1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Position = " + pos);
                    break;

                default:
                    return;
            }
            System.out.println("Stack contents = " + s);
        }
    }
}
