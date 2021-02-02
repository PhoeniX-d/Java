import java.awt.*;

/* Way 1 : By creating object of Frame class 
class  Test
{
    public static void main(String[] args) 
    {
        Frame f = new Frame("My AWT Frame");
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
*/

/* Way 2 : By extending Frame class and creating object of subclass 
class Test extends Frame
{
    Test(String str)
    {
        super(str);
    }
    public static void main(String[] args) 
    {
        Test t = new Test("My AWT Frame 2");
        t.setSize(500, 500);
        t.setVisible(true);
    }
}
*/