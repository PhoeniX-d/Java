import java.io.Console;

public class ConsoleDemo{
    public static void main(String[] args) {
        Console c = System.console();
        String name = c.readLine("User Name     : ");
        char[] pwd = c.readPassword("User Pwd      : ");
        String upwd = new String(pwd);
        if(name.equals("admin") && upwd.equals("admin")){
            System.out.println("Login sucesss :)");
        }
        else{
            System.out.println("Login failed :(");
        }
    }
}
